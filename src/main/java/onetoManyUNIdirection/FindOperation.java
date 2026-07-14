
package onetoManyUNIdirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindOperation {
	
public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		
		et.begin();
		
		Models m=em.find(Models.class, 103);
		System.out.println(m.getId());
		System.out.println(m.getModel());
		System.out.println(m.getColor());
		
		System.out.println("....................");
		
		BMWbrand b=em.find(BMWbrand.class, 201);
		System.out.println(b.getId());
		System.out.println(b.getfuel());
		System.out.println(".........................");
		
		for(Models ms:b.slist) {
			System.out.println(ms.getId());
			System.out.println(ms.getColor());
			System.out.println(ms.getPrice());
			System.out.println(ms.getModel());
			System.out.println(".........................");
		}
		
		
		
		
		
		et.commit();
		
}

}
