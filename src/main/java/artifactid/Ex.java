package artifactid;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Ex {

	public static void main(String[] args) {
		System.out.println(1);
		Configuration cfg=new Configuration();
		System.out.println(2);
		cfg.configure();
		System.out.println(3);
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sessionFactory =cfg.buildSessionFactory();
		System.out.println(4);
		Session session=sessionFactory.openSession();
		System.out.println(5);
		Student student=session.load(Student.class, 1);
		System.out.println(student);
		Criteria criteria=session.createCriteria(Student.class);
		
		
	}
}
