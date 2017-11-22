/**
 * 
 */
package test.persistancyArchitecture.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import test.persistancyArchitecture.dto.StudentIspitDTO;

/**
 * @author vitor.tomic
 *
 */
public class Student {
	private Integer id;
	private String ime;
	private String prezime;
	private String brojIndexa;
	@JsonIgnore
	private List<Ispit> ispiti;
	private transient List<StudentIspitDTO> studentoviIspiti;
	private transient Double prosek;
	
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
	public String getBrojIndexa() {
		return brojIndexa;
	}
	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	public List<Ispit> getIspiti() {
		return ispiti;
	}
	public void setIspiti(List<Ispit> ispiti) {
		this.ispiti = ispiti;
	}
	public Double getProsek() {
		return prosek;
	}
	public void setProsek(Double prosek) {
		this.prosek = prosek;
	}
	public List<StudentIspitDTO> getStudentoviIspiti() {
		return studentoviIspiti;
	}
	public void setStudentoviIspiti(List<StudentIspitDTO> studentoviIspiti) {
		this.studentoviIspiti = studentoviIspiti;
	}
}
