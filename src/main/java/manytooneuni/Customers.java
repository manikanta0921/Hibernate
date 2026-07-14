package manytooneuni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customers {
	
	@Id
	private int id;
	private String name;
	private int accountNo;
	
	@ManyToOne
	private Bank bank;

	public Customers() {
		super();
	}

	public Customers(int id, String name, int accountNo, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.accountNo = accountNo;
		this.bank = bank;
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

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	
	
	

}
