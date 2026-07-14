package onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=new Person(102,"sri",23,null);
		PanCard pc=new PanCard(202,"GH78HJ","30-2004",p);
		p.setPc(pc);
		
		et.begin();
		em.persist(p);
		em.persist(pc);
		et.commit();
		
		
		
		
		

	}

}
