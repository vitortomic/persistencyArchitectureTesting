/**
 * 
 */
package test.persistancyArchitecture.repositories.impl;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PolaganjeIspita;
import test.persistancyArchitecture.domain.Profesor;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.dto.StudentIspitDTO;
import test.persistancyArchitecture.repositories.PolaganjeIspitaRepository;

/**
 * @author vitor.tomic
 *
 */
@Repository
public class PolaganjeIspitaRepositoryImpl implements PolaganjeIspitaRepository {
	
	@Autowired
	private Sql2o sql2o;
	
	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.repositories.PolaganjeIspitaRepository#create(test.persistancyArchitecture.domain.Student, test.persistancyArchitecture.domain.Profesor, test.persistancyArchitecture.domain.IspitniRok)
	 */
	@Override
	public PolaganjeIspita create(Student student, Profesor profesor, IspitniRok ispitniRok) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.repositories.PolaganjeIspitaRepository#findByStudent(test.persistancyArchitecture.domain.Student)
	 */
	@Override
	public List<StudentIspitDTO> findByStudent(Student student) {
		String sql = "select i.ime nazivIspita, case when poi.ocena > 5 then 1 else 0 end polozen,poi.ocena " + 
				"from PolaganjeIspita poi join PrijavaIspita pri on poi.prijavaispita_id = pri.id join Ispit i on pri.ispit_id = i.id " + 
				"where pri.student_id=:studentId";
		try(Connection con = sql2o.open()){
			return con.createQuery(sql)
					.addParameter("studentId", student.getId())
					.executeAndFetch(StudentIspitDTO.class);
		}
	}

}
