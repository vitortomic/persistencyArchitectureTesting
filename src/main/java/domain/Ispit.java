/**
 * 
 */
package domain;

import java.util.List;

/**
 * @author vitor.tomic
 *
 */
public class Ispit {
	private Integer id;
	private List<Profesor> predavaci;
	private String ime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Profesor> getPredavaci() {
		return predavaci;
	}
	public void setPredavaci(List<Profesor> predavaci) {
		this.predavaci = predavaci;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}

}
