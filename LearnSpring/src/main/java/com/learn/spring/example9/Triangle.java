package com.learn.spring.example9;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context = null;
	
	public Point getPointA() {
		return (Point) context.getBean("zeroPoint");
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return (Point) context.getBean("point2");
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return (Point) context.getBean("point3");
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw(){
		System.out.println("Point A = (" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("Point B = (" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("Point C = (" + pointC.getX() + ", " + pointC.getY() + ")");
	}


	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
	}


	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);
	}
}
