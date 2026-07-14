package hibernatepractice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
	
	@Id
	private int id;
	private long adharno;
	private String city;
	
	
	public Adhar() {
		super();
	}


	public Adhar(int id, long adharno, String city) {
		super();
		this.id = id;
		this.adharno = adharno;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getAdharno() {
		return adharno;
	}


	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	

}
