/**
 * 
 */
package domain;

import java.util.Date;

/**
 * @author vitor.tomic
 *
 */
public class IspitniRok {
	private Ispit ispit;
	private String godina;
	private Date datum;
	
	public Ispit getIspit() {
		return ispit;
	}
	public void setIspit(Ispit ispit) {
		this.ispit = ispit;
	}
	public String getGodina() {
		return godina;
	}
	public void setGodina(String godina) {
		this.godina = godina;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	
}
