/**
 * 
 */
package test.persistancyArchitecture.services;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PrijavaIspita;
import test.persistancyArchitecture.domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface PrijavaIspitaService {
	public PrijavaIspita prijaviIspit(Student student, Ispit ispit, IspitniRok rok);
}
