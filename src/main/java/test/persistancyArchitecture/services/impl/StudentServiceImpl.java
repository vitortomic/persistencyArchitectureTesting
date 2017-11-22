/**
 * 
 */
package test.persistancyArchitecture.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.repositories.StudentRepository;
import test.persistancyArchitecture.services.StudentService;

/**
 * @author vitor.tomic
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.StudentService#getPolozeniIspiti(test.persistancyArchitecture.domain.Student)
	 */
	@Override
	public List<Ispit> getPolozeniIspiti(Student student) {
		return studentRepository.getIspitsForStudent(student, true);
	}

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.StudentService#getNepolozeniIspiti(test.persistancyArchitecture.domain.Student)
	 */
	@Override
	public List<Ispit> getNepolozeniIspiti(Student student) {
		return studentRepository.getIspitsForStudent(student, false);
	}

	@Override
	public List<Ispit> getAllIspiti(Student student) {
		return studentRepository.getIspitsForStudent(student, null);
	}

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.StudentService#getProsecnaOcena(test.persistancyArchitecture.domain.Student)
	 */
	@Override
	public Double getProsecnaOcena(Student student) {
		return studentRepository.getProsecnaOcena(student);
	}

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.StudentService#findByIndex(java.lang.String)
	 */
	@Override
	public Student findByIndex(String index) {
		return studentRepository.getStudent(index);
	}
	
}
