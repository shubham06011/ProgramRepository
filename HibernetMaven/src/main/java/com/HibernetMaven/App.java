package com.HibernetMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration  configuration = new Configuration();
		configuration.configure("connection.cfg.xml");
		
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		 
		 //create record 
		 
		Users user1 = new Users();
		user1.setName("shubham");
		user1.setMidname("sanjay");
		user1.setSurname("talkhande");
		session.save(user1);
		transaction.commit();
		System.out.println("completed");
    }
}
