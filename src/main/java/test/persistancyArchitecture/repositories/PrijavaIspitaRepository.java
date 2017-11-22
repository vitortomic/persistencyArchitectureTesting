/**
 * 
 */
package test.persistancyArchitecture.repositories;

import java.util.List;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PrijavaIspita;
import test.persistancyArchitecture.domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface PrijavaIspitaRepository {
	public PrijavaIspita create(Student student, Ispit ispit, IspitniRok ispitniRok);
	public List<PrijavaIspita> findByStudent(Student student);
	public List<PrijavaIspita> findByIspitniRok(IspitniRok ispitniRok);
}
