package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Address;
import com.hefshine.beans.Person;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
		
		Session session = factory.openSession();

		session.beginTransaction();
		
//      Insert Record
		
		Address address=new Address("Dhankawadi", "411043");

		Person person = new Person(106, "Pooja", "Chavan", address);  //Insert Record

		session.save(person);
		
		session.getTransaction().commit();

		session.close();

	}

}
