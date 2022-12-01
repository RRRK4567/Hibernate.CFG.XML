package service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main (String[] args) {
		System.out.println("Connecting to database");
		SessionFactory factory = new Configuration()
				.configure("Hibernate.cfg.xml")
				.buildSessionFactory();
		System.out.println("Created");
	}

}
