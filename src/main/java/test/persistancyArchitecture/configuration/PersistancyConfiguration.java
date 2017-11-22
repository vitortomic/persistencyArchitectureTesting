/**
 * 
 */
package test.persistancyArchitecture.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sql2o.Sql2o;

/**
 * @author vitor.tomic
 *
 */
@Configuration
public class PersistancyConfiguration {
	
	@Bean
	Sql2o sql2o(DataSource dataSource) {
		return new Sql2o(dataSource);
	}
}
