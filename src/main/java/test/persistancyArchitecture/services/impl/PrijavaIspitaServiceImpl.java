/**
 * 
 */
package test.persistancyArchitecture.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PrijavaIspita;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.repositories.PrijavaIspitaRepository;
import test.persistancyArchitecture.services.PrijavaIspitaService;

/**
 * @author vitor.tomic
 *
 */
@Service
public class PrijavaIspitaServiceImpl implements PrijavaIspitaService {

	@Autowired
	private PrijavaIspitaRepository prijavaIspitaRepository;
	
	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.PrijavaIspitaService#prijaviIspit(test.persistancyArchitecture.domain.Student, test.persistancyArchitecture.domain.Ispit, test.persistancyArchitecture.domain.IspitniRok)
	 */
	@Override
	public PrijavaIspita prijaviIspit(Student student, Ispit ispit, IspitniRok rok) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.PrijavaIspitaService#getPrijaveForStudent(test.persistancyArchitecture.domain.Student)
	 */
	@Override
	public List<PrijavaIspita> getPrijaveForStudent(Student student) {
		return prijavaIspitaRepository.findByStudent(student);
	}

}
