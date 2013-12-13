package com.learn.spring.example9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.example9.Triangle;

public class ApplicationContextAwareExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
