package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class).buildSessionFactory();
		
		// Unit of work pattern
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		//HQL - hibernate query language
		//from City c where c.countryCode = 'TUR' Order By c.name DESC
		//List<City> cities = session.createQuery("select City.countryCode from City c Group By c.countryCode").getResultList();
		//List<String> cCodes = session.createQuery("select c.countryCode from City c Group By c.countryCode").getResultList();
		
		/*
		 * City city = new City(); city.setName("Düzce 10"); city.setCountryCode("TUR");
		 * city.setDistrict("Karadeniz"); city.setPopulation(103);
		 * session.save(city);
		 */
		
		//update
		/*
		 * City city = session.get(City.class, 4086); 
		 * city.setPopulation(15);
		 * session.save(city); 
		 * System.out.println(city.getName());
		 */
		
		//Delete
		City city = session.get(City.class, 4086);
		session.delete(city);
		
		
		
		session.getTransaction().commit();
		System.out.println("Şehir Gitti");
		
		session.close();
		factory.close();
		
		//for (String city:cCodes) {
//			System.out.println(city);
//		}
	
	
	}

}
