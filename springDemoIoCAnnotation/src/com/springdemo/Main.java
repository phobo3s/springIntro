package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	
		ICustomerDal cutomerDal = context.getBean("database",ICustomerDal.class);
		
		cutomerDal.add();
	}
	
	//IoC - Inversion of Control
}
