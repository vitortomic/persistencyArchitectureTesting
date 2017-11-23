/**
 * 
 */
package test.persistancyArchitecture.repositories;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.entitymappers.IspitniRokMapper;
import test.persistancyArchitecture.enums.Rok;

/**
 * @author vitor.tomic
 *
 */
public interface IspitniRokRepository {
	
	@SqlQuery("SELECT * FROM IspitniRok WHERE godina = :godina and rok = :rok")
	@RegisterMapper(IspitniRokMapper.class)
	public IspitniRok findByGodinaAndRok(@Bind("godina")String godina, @Bind("rok") Integer rok);
	
	public Double findProlaznostPoRoku(IspitniRok ispitniRok);
}
