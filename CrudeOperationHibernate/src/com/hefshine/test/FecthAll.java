package com.hefshine.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Person;

public class FecthAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
		
		Session session = factory.openSession();

		session.beginTransaction();
		//Fetch ALL Record
		
		 
				Query query=session.createQuery("from Person");
				
				List<Person> list=query.getResultList();
				
				System.out.println(list);
				
				session.getTransaction().commit();

				session.close();
	}

}
