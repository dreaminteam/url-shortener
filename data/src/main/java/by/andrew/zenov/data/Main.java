package by.andrew.zenov.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext aContext = new ClassPathXmlApplicationContext("data-spring-context.xml");
		
	}
}
