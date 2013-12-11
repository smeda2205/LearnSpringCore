package com.learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * This is the first application, which explains how spring dependency works.
 * 
 * @author srimeda
 * 
 */
public class DrawingApp {
	public static void main(String[] args) {

		/*
		 * Without using Spring Bean Factory
		 */
		Triangle triangle = new Triangle();
		triangle.draw();

		/*
		 * Using Spring, Here we will not use new to create the bean, instead we
		 * ask the spring's bean factory to create the bean and give.
		 * 
		 * We have multiple types of bean factories. Here, we are using XMLBeanFactory which configures using XML file.
		 * It takes a resource, which is the file where the configurations are defined.
		 */
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle1 = (Triangle) beanFactory.getBean("triangle");
		triangle1.draw();
		
	}
}
