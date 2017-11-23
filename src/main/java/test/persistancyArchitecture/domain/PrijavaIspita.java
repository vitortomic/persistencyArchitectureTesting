/**
 * 
 */
package test.persistancyArchitecture.domain;


/**
 * @author vitor.tomic
 *
 */
public class PrijavaIspita {
	private Integer id;
	private Ispit ispit;
	private Student student;
	private IspitniRok ispitniRok;
	
	public PrijavaIspita(Integer id, Ispit ispit, Student student, IspitniRok ispitniRok) {
		super();
		this.id = id;
		this.ispit = ispit;
		this.student = student;
		this.ispitniRok = ispitniRok;
	}
	
	public PrijavaIspita() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Ispit getIspit() {
		return ispit;
	}
	public void setIspit(Ispit ispit) {
		this.ispit = ispit;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public IspitniRok getIspitniRok() {
		return ispitniRok;
	}
	public void setIspitniRok(IspitniRok ispitniRok) {
		this.ispitniRok = ispitniRok;
	}
	
}
