package com.vishu.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
	Session session=sf.openSession();
		
	Student s=new Student();
	s.setName("vishal");
	s.setRoll(1);
	Student s1=new Student();
	s1.setName("Aryan");
	s1.setRoll(2);
	
	School ss=new School();
	ss.setSchoolname("Nios");
	
	s.setSchool(ss);
	s1.setSchool(ss);
	session.save(s);
	session.save(s1);
	session.beginTransaction().commit();
	System.out.println("done");
	}

}
