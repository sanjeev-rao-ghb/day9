package com.opps.constructor;

public class Rectangle {

	int length;
	int breadth;
	public Rectangle() {
		length=0;
		breadth=0;
		
	}
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth  = breadth;
	}
	public int area() {
		return length*breadth;
	}
	public static void main(String []args) {
		Rectangle rec=new Rectangle();
		Rectangle rec1=new Rectangle(6,3);
		System.out.println("rectangle area:"+rec.area());
		System.out.println("recrangle area:"+rec1.area());
		
	}

}
