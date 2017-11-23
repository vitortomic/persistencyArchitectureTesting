/**
 * 
 */
package test.persistancyArchitecture.domain;

import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import test.persistancyArchitecture.domain.entitymappers.IspitniRokMapper;
import test.persistancyArchitecture.enums.Rok;

/**
 * @author vitor.tomic
 *
 */
public class IspitniRok {
	private Integer id;
	private String godina;
	private Rok rok;
	
	public IspitniRok(Integer id, String godina, Rok rok) {
		this.id = id;
		this.godina = godina;
		this.rok = rok;
	}
	
	public IspitniRok() {
		
	}
	
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
