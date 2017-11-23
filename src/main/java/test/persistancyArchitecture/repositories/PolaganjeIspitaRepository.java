/**
 * 
 */
package test.persistancyArchitecture.repositories;

import java.util.List;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PolaganjeIspita;
import test.persistancyArchitecture.domain.Profesor;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.dto.StudentIspitDTO;

/**
 * @author vitor.tomic
 *
 */
public interface PolaganjeIspitaRepository {
	
	public PolaganjeIspita create(Student student, Profesor profesor, 
			IspitniRok ispitniRok);
	
	public List<StudentIspitDTO> findByStudent(Student student);
}
