/**
 * 
 */
package test.persistancyArchitecture.domain.entitymappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.enums.Rok;

/**
 * @author vitor.tomic
 *
 */
public class IspitniRokMapper implements ResultSetMapper<IspitniRok>{

	@Override
	public IspitniRok map(int index, ResultSet re, StatementContext ctx) throws SQLException {
		Integer id = re.getInt("id");
		String godina = re.getString("godina");
		Rok rok = Rok.values()[re.getInt("rok")];
		return new IspitniRok(id, godina, rok);
	}
}
