package com.learn.spring.example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.example4.Triangle;

/**
 * Example demonstrates Bean Autowiring
 * 
 * Autowiring helps skip some of the configurations we do by intelligently
 * guessing.
 * 
 * There are different types of Autowiring:
 * 
 * 		byName - by name of the variables.
 * 
 *		byType - by type of the variables. This works only when there is only one
 * variable for a particular type.
 * 
 * 		constructor - does the same as byType. The only difference is it does by
 * constructor instead of setter injection.
 * 
 * If we have not mention any autowire attribute, it doesn't do any autowiring.
 * 
 * @author srimeda
 * 
 */
public class AutowiringExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
