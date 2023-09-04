package com.onetoone;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.sql.Insert;

import com.hibernate.HibernateUtil;
import com.onetoone.Student;


public class onetooneHibernate {
	
	public void saveonetooneExample(Student student,Address address)
	{
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				
				transaction = session.beginTransaction();
//				address.setStudent(student);
				student.setAddress(address);
				session.save(student);
				transaction.commit();
			} catch (HibernateException e) {
				e.printStackTrace();
			} finally {
				session.close();
			}
		}
	
	

	public static void main(String[] args) {
	
		onetooneHibernate obj = new onetooneHibernate();
		
		Student student = new Student();
		student.setStudent_id(1000);
		student.setStudent_name("hari");
		student.setStudent_email("hari04harry@gmail.com");
		student.setStudent_mobilenum(735857139);
		student.setStudent_address("chennai");
		
		Address address =new Address();
		address.setAddress_id(100);
		address.setStreet_name("venkatapuram");
		address.setCity("chennai");
		address.setState("tamilnadu");
		address.setPincode(600053);
		
		 obj.saveonetooneExample(student,address);

		
	}

}
