package onetoonebi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	private int id;
	private String panNo;
	private String dob;
	@OneToOne
	 Person p;
	public PanCard() {
		super();
	}
	public PanCard(int id, String panNo, String dob, Person p) {
		super();
		this.id = id;
		this.panNo = panNo;
		this.dob = dob;
		this.p = p;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	

}
