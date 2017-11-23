/**
 * 
 */
package test.persistancyArchitecture.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PolaganjeIspita;
import test.persistancyArchitecture.domain.Profesor;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.repositories.PolaganjeIspitaRepository;
import test.persistancyArchitecture.services.PolaganjeIspitaService;

/**
 * @author vitor.tomic
 *
 */
@Service
public class PolaganjeIspitaServiceImpl implements PolaganjeIspitaService {
	
	@Autowired
	private PolaganjeIspitaRepository polaganjeIspitaRepository;
	
	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.PolaganjeIspitaService#unesiOcenu(test.persistancyArchitecture.domain.Student, test.persistancyArchitecture.domain.Profesor, test.persistancyArchitecture.domain.IspitniRok)
	 */
	@Override
	public PolaganjeIspita unesiOcenu(Student student, Profesor profesor, IspitniRok ispitniRok) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.PolaganjeIspitaService#getPrijava(java.lang.Integer)
	 */
	@Override
	public Optional<PolaganjeIspita> getPolaganje(Integer id) {
		return Optional.ofNullable(polaganjeIspitaRepository.findById(id));
	}

}
