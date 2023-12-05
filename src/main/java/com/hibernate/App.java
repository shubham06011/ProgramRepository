package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App{ 

    public static void main( String[] args ) {
    Configuration configuration = new Configuration();
	configuration.configure("NewFile.cfg.xml");
	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	Insurence obj = new Insurence ();
	
	
	
	obj.setName("shubham");
	obj.setDept("mech");
	obj.setRoolno(112);
	session.save(obj);
	
	Insurence obj1 = new Insurence ();
	
	obj1.setName("mrunmayee");
	obj1.setDept("civil");
	obj1.setRoolno(123);
	session.save(obj1);
	
	transaction.commit();
	session.close();
    System.out.println( "Hello World!" );

    }
    }

