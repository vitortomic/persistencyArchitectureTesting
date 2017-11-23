/**
 * 
 */
package test.persistancyArchitecture.domain.entitymappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import test.persistancyArchitecture.domain.Ispit;
import test.persistancyArchitecture.domain.IspitniRok;
import test.persistancyArchitecture.domain.PrijavaIspita;
import test.persistancyArchitecture.domain.Student;
import test.persistancyArchitecture.enums.Rok;

/**
 * @author vitor.tomic
 *
 */
public class PrijavaIspitaMapper implements ResultSetMapper<PrijavaIspita>{

	@Override
	public PrijavaIspita map(int index, ResultSet re, StatementContext ctx) throws SQLException {
		Integer studentId = re.getInt(1);
		String imeStudenta = re.getString(2);
		String prezimeStudenta = re.getString(3);
		String brojIndexa = re.getString(4);
		Integer prijavaId = re.getInt(5);
		Integer ispitId = re.getInt(6);
		Integer ispitniRokId = re.getInt(8);
		String imeIspita = re.getString(10);
		String godina = re.getString(12);
		Rok rok = Rok.values()[re.getInt(13)];
		
		Student student = new Student(studentId, imeStudenta, prezimeStudenta, brojIndexa);
		Ispit ispit = new Ispit(ispitId, imeIspita);
		IspitniRok ispitniRok = new IspitniRok(ispitniRokId, godina, rok);
		
		return new PrijavaIspita(prijavaId, ispit, student, ispitniRok);
	}

}
