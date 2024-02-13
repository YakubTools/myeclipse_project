package com.sai;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DeleteTest {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/sai/MySQL.cfg.xml"); 
		//HB container creates high level object
		SessionFactory factory = cfg.buildSessionFactory();
		//Creating session between Java Application and Database
		Session session = factory.openSession();
		//Create a transaction
		Transaction tx = session.beginTransaction();
		Employee employee = (Employee)session.get(Employee.class, 103);
		System.out.println(employee);
		session.delete(employee);
		System.out.println("One Record Deleted SuccessFully...........");
		//Commit the tx
		tx.commit();
		//Close the session and factory objects
		session.close();
		factory.close();

	}

}
