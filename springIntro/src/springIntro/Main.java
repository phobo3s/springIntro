package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	
		ICustomerService cutomerService = context.getBean("service",ICustomerService.class);
		
		cutomerService.add();
	}
	
	//IoC - Inversion of Control
}
