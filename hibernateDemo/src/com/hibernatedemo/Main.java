package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class).buildSessionFactory();
	
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		//HQL - hibernate query language
		//from City c where c.countryCode = 'TUR' Order By c.name DESC
		//List<City> cities = session.createQuery("select City.countryCode from City c Group By c.countryCode").getResultList();
		List<String> cCodes = session.createQuery("select c.countryCode from City c Group By c.countryCode").getResultList();
		
		session.getTransaction().commit();
		
		session.close();
		factory.close();
		
		for (String city:cCodes) {
			System.out.println(city);
		}
	
	
	}

}
