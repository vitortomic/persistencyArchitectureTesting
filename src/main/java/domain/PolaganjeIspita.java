/**
 * 
 */
package domain;

/**
 * @author vitor.tomic
 *
 */
public class PolaganjeIspita {
	private PrijavaIspita prijava;
	private Double ocena;
	private Profesor ispitivac;
	
	public PrijavaIspita getPrijava() {
		return prijava;
	}
	public void setPrijava(PrijavaIspita prijava) {
		this.prijava = prijava;
	}
	public Double getOcena() {
		return ocena;
	}
	public void setOcena(Double ocena) {
		this.ocena = ocena;
	}
	public Profesor getIspitivac() {
		return ispitivac;
	}
	public void setIspitivac(Profesor ispitivac) {
		this.ispitivac = ispitivac;
	}
	
	
	
}
