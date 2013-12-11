package com.learn.spring;

public class Triangle {

	public Triangle(){
		
	}
	
	// Added for Example 3
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public Triangle(int height){
		this.height = height;
	}
	
	private int height;

	public int getHeight() {
		return height;
	}

	// Added till here for example 3

	// Added For example 2
	private String type;

	public String getType() {
		return type;
	}

	/*
	 * //Commenting out for example 3 to demonstrate constructor injection
	public void setType(String type) {
		this.type = type;
	}*/
	//Added till her for example 2
	
	// Modified this for all the three examples.
	public void draw() {
		//System.out.println("Drawing Triangle!!"); 
		//System.out.println("Drawing Triangle of type " + getType() + "!!");
		System.out.println("Drawing Triangle of type " + getType() + " with height " + getHeight() + "!!");
	}
}
