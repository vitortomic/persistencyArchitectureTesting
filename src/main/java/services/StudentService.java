/**
 * 
 */
package services;

import java.util.List;

import domain.Ispit;
import domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface StudentService {
	public List<Ispit> getPolozeniIspiti(Student student);
	public List<Ispit> getNepolozeniIspiti(Student student);
	public Double getProsecnaOcena(Student student);
}
