package com.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	
	private static SessionFactory sessionFactory;
	
	static 
    {
		try{    
			sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory(); //to load cfg
		}
		catch(HibernateException e)
		{
			e.printStackTrace();	
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
