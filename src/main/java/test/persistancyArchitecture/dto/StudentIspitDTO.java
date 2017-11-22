/**
 * 
 */
package test.persistancyArchitecture.dto;


/**
 * @author vitor.tomic
 *
 */
public class StudentIspitDTO {
	private String nazivIspita;
	private Boolean polozen;
	private Integer ocena;
	
	public String getNazivIspita() {
		return nazivIspita;
	}
	public void setNazivIspita(String nazivIspita) {
		this.nazivIspita = nazivIspita;
	}
	public Boolean getPolozen() {
		return polozen;
	}
	public void setPolozen(Boolean polozen) {
		this.polozen = polozen;
	}
	public Integer getOcena() {
		return ocena;
	}
	public void setOcena(Integer ocena) {
		this.ocena = ocena;
	}
}
