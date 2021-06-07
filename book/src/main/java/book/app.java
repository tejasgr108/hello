package book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class app {
	Configuration conn = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
	SessionFactory sf = conn.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	
	
	

}
