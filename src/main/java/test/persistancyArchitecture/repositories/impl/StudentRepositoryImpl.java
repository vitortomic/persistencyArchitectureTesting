/**
 * 
 */
package test.persistancyArchitecture.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.PolaganjeIspita;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.repositories.PolaganjeIspitaRepository;
import test.persistancyArchitecture.repositories.StudentRepository;

/**
 * uses sql2o for database access
 * @author vitor.tomic
 *
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	private Sql2o sql2o;
	
	@Autowired
	private PolaganjeIspitaRepository polaganjeIspitaRepository;
	
	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.repositories.StudentRepository#getStudent(java.lang.String)
	 */
	@Override
	public Student getStudent(String index) {
		String sql = "SELECT * FROM student WHERE brojIndexa=:index";
		try(Connection con = sql2o.open()){
			Student student = con.createQuery(sql)
					.addParameter("index", index)
					.executeAndFetchFirst(Student.class);
		
			student.setProsek(getProsecnaOcena(student));
			student.setStudentoviIspiti(polaganjeIspitaRepository.findByStudent(student));
			return student;
		}
	}

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.repositories.StudentRepository#getProsecnaOcena(test.persistancyArchitecture.domain.Student)
	 */
	@Override
	public Double getProsecnaOcena(Student student) {
		String sql = "SELECT avg(cast(ocena as float)) "
				+ "FROM student s join prijavaispita pri on s.id = s.id join polaganjeispita poi on poi.prijavaispita_id = pri.id" + 
				" WHERE ocena > 5 and s.id=:studentId";
		try(Connection con = sql2o.open()){
			return (Double)con.createQuery(sql)
					.addParameter("studentId", student.getId())
					.executeScalar();
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see test.persistancyArchitecture.repositories.StudentRepository#getIspitsForStudent(test.persistancyArchitecture.domain.Student, java.lang.Boolean)
	 */
	@Override
	public List<Ispit> getIspitsForStudent(Student student, Boolean polozeni) {
		
		String joinWithPolaganjaFromString = polozeni != null ?
				" left join prijavaispita pri on pri.ispit_id = i.id left join polaganjeispita pol on pol.prijavaispita_id = pri.id " : "";
		String joinWithPolaganjaWhereString = polozeni != null  ? 
				polozeni ?  " and ocena > 5 " : " and (ocena is null or ocena = 5) " : "";
		
		String sql = "SELECT distinct i.id, i.ime " +
				"FROM student s join student_ispit si on s.id = si.student_id join ispit i on si.ispit_id = i.id " +
					joinWithPolaganjaFromString +
				"WHERE s.id=:studentId " + 
					joinWithPolaganjaWhereString;
		try(Connection con = sql2o.open()){
			return con.createQuery(sql)
					.addParameter("studentId", student.getId())
					.executeAndFetch(Ispit.class);
		}
	}
	
	
}
