/**
 * 
 */
package test.persistancyArchitecture.repositories;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PolaganjeIspita;
import test.persistancyArchitecture.domain.Profesor;
import test.persistancyArchitecture.domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface PolaganjeIspitaRepository {
	public PolaganjeIspita create(Student student, Profesor profesor, 
			IspitniRok ispitniRok);
}
