package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Person;

public class FetchOne {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
		
		Session session = factory.openSession();

		session.beginTransaction();
		
		Person person = session.get(Person.class, 106);
		
				session.save(person);
				
//				Update Record
				
				person.setFirstName("Suraj");
				person.setLastName("Bhosale");
				
				session.getTransaction().commit();

				session.close();

	}

}
