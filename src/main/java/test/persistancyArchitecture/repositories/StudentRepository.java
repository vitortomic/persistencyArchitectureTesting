/**
 * 
 */
package test.persistancyArchitecture.repositories;

import test.persistancyArchitecture.domain.Student;

/**
 * @author vitor.tomic
 *
 */
public interface StudentRepository {
	public Student getStudent(String index);
	public Double getProsecnaOcena(Student student);
}
