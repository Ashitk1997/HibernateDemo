package com.hefshine.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Address;
import com.hefshine.beans.Person;

public class TestMain {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
		
		Session session = factory.openSession();

		session.beginTransaction();
		
//      Insert Record
		
		//Address address=new Address("Dhankawadi", "411043");

		//Person person = new Person(106, "Pooja", "Chavan", address);  //Insert Record

		//session.save(person);

		
//		Fetch one Record by purticular column name
		
//		Person person = session.get(Person.class, 106);
//
//		session.save(person);
		
////		Update Record
//		
//		person.setFirstName("Suraj");
//		person.setLastName("Bhosale");
		 
		
		//Fetch ALL Record
		
		 
		Query query=session.createQuery("from Person");
		
		List<Person> list=query.getResultList();
		
		System.out.println(list);
		
		session.getTransaction().commit();

		session.close();

	}

}
