package com.learn.spring.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.example5.Triangle;

/**
 * This example explains the usage of Inner Beans, Aliases.
 * 
 * @author srimeda
 * 
 */
public class InnerBeansExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		/*
		 * Invoking triangle with the alias triangle-alias
		 */
		Triangle triangle1 = (Triangle) context.getBean("triangle-alias");
		triangle1.draw();
		
		/*
		 * Invoking triangle with the alias provided using name property
		 */
		Triangle triangle2 = (Triangle) context.getBean("triangle-name");
		triangle2.draw();
	}
}
