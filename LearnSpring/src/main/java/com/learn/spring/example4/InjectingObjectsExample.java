package com.learn.spring.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is an example to illustrate how we can inject objects inside another
 * object.
 * 
 * @author srimeda
 * 
 */
public class InjectingObjectsExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
