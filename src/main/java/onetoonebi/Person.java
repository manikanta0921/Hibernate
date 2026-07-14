package onetoonebi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private int age;
	
	@OneToOne
	PanCard pc;

	
	public Person() {
		super();
	}

	public Person(int id, String name, int age, PanCard pc) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.pc = pc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PanCard getPc() {
		return pc;
	}

	public void setPc(PanCard pc) {
		this.pc = pc;
	}
	
	

}
