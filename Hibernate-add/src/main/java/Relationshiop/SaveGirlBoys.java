package Relationshiop;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveGirlBoys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("deba");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Girl g=new Girl();
		g.setName("Sangita");
		
		
		Boy b1=new Boy();
		b1.setName("Debasish");
		b1.setG(g);
		
		
		Boy b2=new Boy();
		b2.setName("Anand");
		b2.setG(g);
		
		Boy b3=new Boy();
		b3.setName("Sudhir");
		b3.setG(g);
		
		Boy b4=new Boy();
		b4.setName("Sujit");
		b4.setG(g);
		
		List<Boy>boys=new ArrayList<Boy>();
		boys.add(b1);
		boys.add(b2);
		boys.add(b3);
		boys.add(b4);
		
		g.setBoys(boys);
		
		et.begin();
		em.persist(g);
		et.commit();
	}

}
