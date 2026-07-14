package onetoManyUNIdirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class BMWbrand {
	@Id
	private int id;
	private String fuel;
	
	@OneToMany
	List<Models> slist;
	

	public BMWbrand() {
		super();
	}
	
	

	public BMWbrand(int id, String fuel, List<Models> slist) {
		super();
		this.id = id;
		this.fuel = fuel;
		this.slist = slist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfuel() {
		return fuel;
	}

	public void setYear(String fuel) {
		this.fuel = fuel;
	}

	public List<Models> getSlist() {
		return slist;
	}

	public void setSlist(List<Models> slist) {
		this.slist = slist;
	}
	
	
	

}
