package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
		
		Session session = factory.openSession();

		session.beginTransaction();
		
		session.getTransaction().commit();

		session.close();

	}

}
