/**
 * 
 */
package test.persistancyArchitecture.services;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PolaganjeIspita;
import test.persistancyArchitecture.domain.Profesor;
import test.persistancyArchitecture.domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface PolaganjeIspitaService {
	public PolaganjeIspita unesiOcenu(Student student, Profesor profesor, 
			IspitniRok ispitniRok);
	public PolaganjeIspita getPrijava(Integer id);
}
