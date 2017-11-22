/**
 * 
 */
package test.persistancyArchitecture.repositories;

import test.persistancyArchitecture.domain.Ispit;

/**
 * @author vitor.tomic
 *
 */
public interface IspitRepository {
	public Ispit findByIme(String ime);
}
