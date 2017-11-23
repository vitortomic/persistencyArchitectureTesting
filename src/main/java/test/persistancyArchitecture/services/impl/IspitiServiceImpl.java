/**
 * 
 */
package test.persistancyArchitecture.services.impl;

import org.junit.Before;
import org.skife.jdbi.v2.DBI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.enums.Rok;
import test.persistancyArchitecture.repositories.IspitniRokRepository;
import test.persistancyArchitecture.services.IspitiService;

/**
 * @author vitor.tomic
 *
 */
@Service
public class IspitiServiceImpl implements IspitiService {
	
	
	@Autowired
	private IspitniRokRepository ispitniRokRepository;
	
	
	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.IspitiService#getProlaznostPoRoku(test.persistancyArchitecture.domain.IspitniRok)
	 */
	@Override
	public Double getProlaznostPoRoku(IspitniRok ispitniRok) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see test.persistancyArchitecture.services.IspitiService#findByGodinaAndRok(java.lang.String, test.persistancyArchitecture.enums.Rok)
	 */
	@Override
	public IspitniRok findByGodinaAndRok(String godina, Rok rok) {
		
		return ispitniRokRepository.findByGodinaAndRok(godina, rok.ordinal());
	}

}
