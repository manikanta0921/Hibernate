package manytooneuni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private int id;
	private String bankname;
	public Bank() {
		super();
	}
	public Bank(int id, String bankname) {
		super();
		this.id = id;
		this.bankname = bankname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	

}
