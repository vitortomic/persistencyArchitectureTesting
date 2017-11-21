/**
 * 
 */
package test.persistancyArchitecture.domain;

import test.persistancyArchitecture.enums.Rok;

/**
 * @author vitor.tomic
 *
 */
public class IspitniRok {
	private Integer id;
	private String godina;
	private Rok rok;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGodina() {
		return godina;
	}
	public void setGodina(String godina) {
		this.godina = godina;
	}
	public Rok getRok() {
		return rok;
	}
	public void setRok(Rok rok) {
		this.rok = rok;
	}
	
	
}
