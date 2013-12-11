package com.learn.spring.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.Triangle;

/**
 * This example explains the usage of ApplicationContext.
 * 
 * @author srimeda
 * 
 */
public class ApplicationContextExample {
	public static void main(String[] args) {
		/*
		 * 
		 * ApplicationContext does all the functionalities a BeanFactory does.
		 * On top of that, it does many additional functionalities like Event
		 * notifications, AOP, etc.
		 * 
		 * We need to use BeanFactory only when the resources are very crucial.
		 * 
		 * Just like BeanFactory, ApplicationContext also have multiple
		 * implementations. We have used ClassPathXMLApplicationContext
		 * implementation because we are reading the configurations from a file
		 * in the classpath (in this case, i moved the file to
		 * src/main/resources folder).The advantage of it is we don't need to
		 * create FileSystemResource.
		 * 
		 * Note: We need to move the configuration file spring.xml to class
		 * path. In the previous example, we had that in the root of the
		 * project.
		 * 
		 * In this example, we will do another change. that is adding a member
		 * variable (ex: type) to Triangle, to demonstrate pre-setting the value
		 * for member variable while instantiating the object using spring.xml
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
