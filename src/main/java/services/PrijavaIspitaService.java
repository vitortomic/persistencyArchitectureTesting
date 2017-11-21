/**
 * 
 */
package services;

import domain.Ispit;
import domain.IspitniRok;
import domain.PrijavaIspita;
import domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface PrijavaIspitaService {
	public PrijavaIspita prijaviIspit(Student student, Ispit ispit, IspitniRok rok);
}
