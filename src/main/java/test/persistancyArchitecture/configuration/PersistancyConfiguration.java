/**
 * 
 */
package test.persistancyArchitecture.configuration;

import javax.sql.DataSource;

import org.skife.jdbi.v2.DBI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sql2o.Sql2o;

import test.persistancyArchitecture.repositories.IspitniRokRepository;

/**
 * @author vitor.tomic
 *
 */
@Configuration
public class PersistancyConfiguration {
	
	@Autowired
	private DBI dbi;
	
	/**
	 * sql2o
	 * @param dataSource
	 * @return
	 */
	@Bean
	Sql2o sql2o(DataSource dataSource) {
		return new Sql2o(dataSource);
	}
	
	/**
	 * JDBI
	 * @return
	 */
	@Bean
    public DBI dbiBean(DataSource dataSource) {
        return new DBI(dataSource);
    }
	
	@Bean
	public IspitniRokRepository ispitniRokRepository() {
		return dbi.onDemand(IspitniRokRepository.class);
	}
}
