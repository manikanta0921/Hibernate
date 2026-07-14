package onetoManyUNIdirection;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveOperation {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("app");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		
		
		
		
		Models m1=new Models(101,"m1 black panther",80000000,"black");
		Models m2=new Models(102,"m3 awwww ",80000000,"blue");
		Models m3=new Models(103,"m5 sexy model",1200000000,"red");
		Models m4=new Models(104,"m8 latest version",950000000,"white");
		
		List<Models> slist=Arrays.asList(m1,m2,m3,m4);
		BMWbrand b=new BMWbrand(201,"diesel",slist);
		et.begin();
		
		
		em.persist(m1);
		em.persist(m2);
		em.persist(m3);
		em.persist(m4);
		
		em.persist(b);
		
		
		et.commit();
	}

}
