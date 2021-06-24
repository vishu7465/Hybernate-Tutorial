package com.vishu.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class main {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		
		
		
		Adress a=new Adress();
		a.setCity("Modinagar");
		a.setZipcode(201204);
		
		Student s=new Student();
		s.setName("vishal");
		s.setAdress(a);
		session.save(s);
		session.beginTransaction().commit();
		System.out.println("Success");
		
	}

}
