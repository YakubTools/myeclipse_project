package com.sai;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ReadOneRecord {
	public static void main(String[] args) {
		//Loading configuration file into HB container
    	AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/sai/MySQL.cfg.xml"); 
		//HB container creates high level object
		SessionFactory factory = cfg.buildSessionFactory();
		//Creating session between Java Application and Database
		Session session = factory.openSession();
		//Create a transaction
		Transaction tx = session.beginTransaction();
	
		Employee passenger = (Employee)session.get(Employee.class, 102);
		System.out.println(passenger);
		//Commit the tx
		tx.commit();
		//Close the session and factory objects
		session.close();
		factory.close();
	}
}
