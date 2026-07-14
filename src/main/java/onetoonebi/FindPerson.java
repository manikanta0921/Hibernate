package onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindPerson {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		et.begin();
		Person p=em.find(Person.class, 102);      //here we can access pancard details through person
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.getPc().getPanNo());
		
		System.out.println("...........................");
		
		PanCard pc=em.find(PanCard.class,202);   // here we can access persons details with the help of pancard
		System.out.println(pc.getPanNo());
		System.out.println(pc.getP().getName());
		System.out.println(pc.getP().getAge());
	
			et.commit();
			
			
			
			
			

		
		
		
		

	}

}
