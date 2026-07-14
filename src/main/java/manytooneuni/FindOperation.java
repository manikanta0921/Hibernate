package manytooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		et.begin();
		
		Bank b=em.find(Bank.class, 101);
		System.out.println(b.getBankname());
		System.out.println(b.getId());
		
         Customers c=em.find(Customers.class, 201);
         
         System.out.println(c.getId());
         System.out.println(c.getName());
         System.out.println(c.getAccountNo());
         System.out.println(c.getBank().getBankname());
		
		et.commit();

	}

}
