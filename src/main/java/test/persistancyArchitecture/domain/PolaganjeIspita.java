/**
 * 
 */
package test.persistancyArchitecture.domain;

/**
 * @author vitor.tomic
 *
 */
public class PolaganjeIspita {
	private Integer id;
	private PrijavaIspita prijava;
	private Integer ocena;
	private Profesor ispitivac;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public PrijavaIspita getPrijava() {
		return prijava;
	}
	public void setPrijava(PrijavaIspita prijava) {
		this.prijava = prijava;
	}
	public Integer getOcena() {
		return ocena;
	}
	public void setOcena(Integer ocena) {
		this.ocena = ocena;
	}
	public Profesor getIspitivac() {
		return ispitivac;
	}
	public void setIspitivac(Profesor ispitivac) {
		this.ispitivac = ispitivac;
	}
	
	
	
}
