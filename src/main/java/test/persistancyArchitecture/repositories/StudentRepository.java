/**
 * 
 */
package test.persistancyArchitecture.repositories;

import java.util.List;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface StudentRepository {
	
	public Student getStudent(String index);
	
	public Double getProsecnaOcena(Student student);
	
	/**
	 * when polozeni == null returns all ispiti
	 * @param student
	 * @param polozeni
	 * @return
	 */
	public List<Ispit> getIspitsForStudent(Student student, Boolean polozeni);
}
