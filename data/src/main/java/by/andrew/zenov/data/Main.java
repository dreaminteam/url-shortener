package by.andrew.zenov.data;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.andrew.zenov.data.dao.UserDao;
import by.andrew.zenov.data.model.User;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("data-spring-context.xml");
		System.out.println("END");

		UserDao userDao=(UserDao)ctx.getBean("UserDao");
		
		User user1 = new User();
		user1.setLogin("login");
		user1.setPassword("123");
		user1.setEmail("email");

		System.out.println(user1);

//		userDao.insert(user1);
		User user=userDao.get(1L);
		System.out.println(user);
		
		List<User> users=userDao.getAll();
		System.out.println(users);
	}
}
