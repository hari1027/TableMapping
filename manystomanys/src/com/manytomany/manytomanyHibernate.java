package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateUtil;
import com.manytomany.Student;
import com.manytomany.Course;

public class manytomanyHibernate {
	public void savemanytomanyExample(Set<Student> set1)
	{
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				
				transaction = session.beginTransaction();
				session.save(set1);
				transaction.commit();
			} catch (HibernateException e) {
				e.printStackTrace();
			} finally {
				session.close();
			}
		}

	public static void main(String[] args) {
		
		 manytomanyHibernate obj = new manytomanyHibernate();
			
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
			
			Set<Student> set1 = new HashSet<Student>();
			set1.add(student1);
			set1.add(student2);
			
			Course course1 = new Course();
			course1.setCourse_name("maths");
			course1.setDuration(30);
			course1.setFees(2000);
			
			Course course2 = new Course();
			course2.setCourse_name("science");
			course2.setDuration(30);
			course2.setFees(1750);
			
			Set<Course> set2 = new HashSet<Course>();
			set2.add(course1);
			set2.add(course2);
			
			 ((Student) set1).setCourse(set2);
			obj.savemanytomanyExample(set1);
			
			

	}


}
