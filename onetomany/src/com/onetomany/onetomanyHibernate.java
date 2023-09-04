package com.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateUtil;
import com.onetomany.Phone;
import com.onetomany.Student;


public class onetomanyHibernate {
	public void saveonetomanyExample(Student student)
	{
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				
				transaction = session.beginTransaction();
				session.save(student);
				transaction.commit();
			} catch (HibernateException e) {
				e.printStackTrace();
			} finally {
				session.close();
			}
		}
	
	


	public static void main(String[] args) {
      onetomanyHibernate obj = new onetomanyHibernate();
		
		Student student = new Student();
		student.setStudent_name("hari");
		
		Phone phone1 = new Phone();
		phone1.setPhone_type("samsung");
		phone1.setPhone_No(735857139);
		phone1.setPrice(20000);
		
		Phone phone2 = new Phone();
		phone2.setPhone_type("nokia");
		phone2.setPhone_No(735857152);
		phone2.setPrice(25000);
		
		Set<Phone> set = new HashSet<Phone>();
		set.add(phone1);
		set.add(phone2);
		
		student.setPhone(set);

		obj.saveonetomanyExample(student);
		
		

	}

}


