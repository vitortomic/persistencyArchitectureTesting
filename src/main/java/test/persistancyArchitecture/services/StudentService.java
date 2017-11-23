/**
 * 
 */
package test.persistancyArchitecture.services;

import java.util.List;
import java.util.Optional;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface StudentService {
	public List<Ispit> getPolozeniIspiti(Student student);
	public List<Ispit> getNepolozeniIspiti(Student student);
	public List<Ispit> getAllIspiti(Student student);
	public Double getProsecnaOcena(Student student);
	public Optional<Student> findByIndex(String index);
}
