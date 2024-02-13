package com.sai;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class SaveTest {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/sai/MySQL.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Employee e1=new Employee(103,"salman",50000.99d,"infosys");
		Transaction tx=session.beginTransaction();
		session.save(e1);
		System.out.println("New Record Successfully inserted");
		tx.commit();
		session.close();
		factory.close();
	}
}
