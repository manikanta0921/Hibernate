package onetoManyUNIdirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Models {
	@Id
	private int id;
	private String model;
	private double price ;
	private  String color;
	
	public Models() {
		super();
	}

	public Models(int id, String model, double price, String color) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	

}
