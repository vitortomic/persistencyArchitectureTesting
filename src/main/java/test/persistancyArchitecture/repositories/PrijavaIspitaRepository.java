/**
 * 
 */
package test.persistancyArchitecture.repositories;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PrijavaIspita;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.domain.entitymappers.PrijavaIspitaMapper;

/**
 * @author vitor.tomic
 *
 */
public interface PrijavaIspitaRepository {
	
	public PrijavaIspita create(Student student, Ispit ispit, IspitniRok ispitniRok);
	
	@SqlQuery("SELECT * FROM student s join PrijavaIspita pr on s.id = pr.student_id "
			+ "join Ispit i on pr.ispit_id = i.id join IspitniRok ir on pr.ispitniRok_id = ir.id")
	@RegisterMapper(PrijavaIspitaMapper.class)
	public List<PrijavaIspita> findByStudent(Student student);
	
	public List<PrijavaIspita> findByIspitniRok(IspitniRok ispitniRok);
}
