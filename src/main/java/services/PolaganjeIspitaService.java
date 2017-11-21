/**
 * 
 */
package services;

import domain.IspitniRok;
import domain.PolaganjeIspita;
import domain.Profesor;
import domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface PolaganjeIspitaService {
	public PolaganjeIspita unesiOcenu(Student student, Profesor profesor, 
			IspitniRok ispitniRok);
}
