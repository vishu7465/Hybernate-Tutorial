package com.vishu.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg2.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session =sf.openSession();
		
		
		Student s=new Student();
		s.setName("vishal");
		
		Certificate c=new Certificate();
		c.setBoard("Nios Board");
		c.setUniversity("CCS University");
		
		Certificate c1=new Certificate();
		c1.setBoard("Nios Board");
		c1.setUniversity("CCS University");
		
		HashSet<Certificate> certificate=new HashSet<>();
		certificate.add(c);
		certificate.add(c1);
		
	 s.setCertificate(certificate);
		
		session.persist(s);
		
		session.beginTransaction().commit();
		
		System.out.println("done");
		
	}

}
