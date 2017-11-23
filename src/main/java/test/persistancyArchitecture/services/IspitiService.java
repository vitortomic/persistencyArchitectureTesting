/**
 * 
 */
package test.persistancyArchitecture.services;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.enums.Rok;

/**
 * @author vitor.tomic
 *
 */
public interface IspitiService {
	
	public Double getProlaznostPoRoku(IspitniRok ispitniRok);
	
	public IspitniRok findByGodinaAndRok(String godina, Rok rok);
}
