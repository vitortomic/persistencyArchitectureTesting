/**
 * 
 */
package test.persistancyArchitecture.repositories;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.enums.Rok;

/**
 * @author vitor.tomic
 *
 */
public interface IspitniRokRepository {
	public IspitniRok findByGodinaAndRok(String godina, Rok rok);
	public Double findProlaznostPoRoku(IspitniRok ispitniRok);
}
