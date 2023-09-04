package com.manytoone;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateUtil;
import com.manytoone.Student;
import com.manytoone.Address;

public class manytooneHibernate {
	public void savemanytooneExample(Address address)
	{
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				
				transaction = session.beginTransaction();
				session.save(address);
				transaction.commit();
			} catch (HibernateException e) {
				e.printStackTrace();
			} finally {
				session.close();
			}
		}


	public static void main(String[] args) {
		
        manytooneHibernate obj = new manytooneHibernate();
		
		Student student1 = new Student();
		student1.setStudent_name("hari");
		student1.setStudent_email("hari04harry@gmail.com");
		student1.setStudent_mobilenum(735857139);
		student1.setStudent_address("chennai");
		
		Student student2 = new Student();
		student2.setStudent_name("archu");
		student2.setStudent_email("archu08@gmail.com");
		student2.setStudent_mobilenum(735857152);
		student2.setStudent_address("chennai");
		
		Address address =new Address();
		address.setStreet_name("venkatapuram");
		address.setCity("chennai");
		address.setState("tamilnadu");
		address.setPincode(600053);
		
		Set<Student> set = new HashSet<Student>();
		set.add(student1);
		set.add(student2);
		
		address.setStudent(set);

		obj.savemanytooneExample(address);
		
		
	}

}
