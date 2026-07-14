package manytooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank b=new Bank(102,"HDFC");
		Customers c1=new Customers(204,"kiran",34428286,b);
		Customers c2=new Customers(205,"rajesh",8763786,b);
		Customers c3=new Customers(206,"mahesh",8876586,b);
		
		et.begin();
		em.persist(b);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		et.commit();

	}

}
