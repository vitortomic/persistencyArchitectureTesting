/**
 * 
 */
package test.persistancyArchitecture.repositories.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.repositories.StudentRepository;

/**
 * @author vitor.tomic
 *
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	private Sql2o sql2o;
	
	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.repositories.StudentRepository#getStudent(java.lang.String)
	 */
	@Override
	public Student getStudent(String index) {
		String sql = "SELECT * FROM faks.student where brojIndexa=:index";
		try(Connection con = sql2o.open()){
			return con.createQuery(sql)
					.addParameter("index", index)
					.executeAndFetchFirst(Student.class);
		}
	}

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.repositories.StudentRepository#getProsecnaOcena(test.persistancyArchitecture.domain.Student)
	 */
	@Override
	public Double getProsecnaOcena(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
