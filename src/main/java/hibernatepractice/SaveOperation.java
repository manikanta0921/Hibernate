package hibernatepractice;

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
		
		
		
		et.begin();
		Adhar a=new Adhar(101,20202020,"hyd");
		Citizen c=new Citizen(202,"mani",22,a);
		
		em.persist(a);
		em.persist(c);
		
		
		et.commit();
		
		

	}

}
