package by.andrew.zenov.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.andrew.zenov.data.model.User;

public class MainService {

	

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("service-spring-context.xml");

		String[] beans=ctx.getBeanDefinitionNames();
		for(String bean:beans){
			System.out.println(bean);
		}
		System.out.println("END");

		UserService userService=(UserService)ctx.getBean("UserService");
		
		User user1 = new User();

		user1.setLogin("login");
		user1.setPassword("123");
		user1.setEmail("email");

		System.out.println(user1);

		userService.insert(user1);
		User user=userService.get(2L);
		System.out.println(user);
	}

}
