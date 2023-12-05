package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();
    	configuration.configure("NewFile.cfg.xml");
    	SessionFactory factory = configuration.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	//FOR INSERTING THE DATA INTO THE DATABASE
    	
    	/*Students stu = new Students();
    	stu.setId(1);
    	stu.setName("shubham");
    	stu.setSurname("Talkhande");
    	stu.setSalary(40000);
    	session.save(stu);
    	
    	Students stu1 = new Students();
    	stu1.setId(2);
    	stu1.setName("Shrunkhal");
    	stu1.setSurname("Pimpleshende");
    	stu1.setSalary(50000);
    	session.save(stu1);
    	
    	Students stu2 = new Students();
    	stu2.setId(3);
    	stu2.setName("Samiksha");
    	stu2.setSurname("Bhilkar");
    	stu2.setSalary(101000);
    	session.save(stu2);
    	
    	session.close();
    	transaction.commit();*/
    	
    	//FOR UPDATING THE RECORDS IN DATABASE
    /*	Students stu = session.get(Students.class, 1);
    	stu.setName("shrikant");
    	stu.setSurname("Hirudkar");
        session.update(stu);
        transaction.commit();*/
    	
    	//FOR DELETING THE RECORDS
    	/*Students stu = session.get(Students.class, 4);
    	session.delete(stu);
    	transaction.commit();*/
    	
    	//FOR FETCHING THE DATA FROM DATABASE
    	
    	List<Students> list = session.createQuery("from Students").list();
    	for(Students s:list) {
    		System.out.println(s.getId());
    		System.out.println(s.getName());
    		System.out.println(s.getSurname());
    		System.out.println(s.getSalary());
    	}
    	
        System.out.println( "Hello World!" );
    }
}
