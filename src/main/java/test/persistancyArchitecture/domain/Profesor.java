/**
 * 
 */
package test.persistancyArchitecture.domain;

import java.util.List;

/**
 * @author vitor.tomic
 *
 */
public class Profesor {
	private Integer id;
	private String ime;
	private String prezime;
	private List<Ispit> ispiti;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public List<Ispit> getIspiti() {
		return ispiti;
	}

	public void setIspiti(List<Ispit> ispiti) {
		this.ispiti = ispiti;
	}
	
	
}
