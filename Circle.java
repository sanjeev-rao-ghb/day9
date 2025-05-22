package com.opps.constructor;

public class Circle {

	public double radius;
	public Circle() {
		 radius=20;
		System.out.println("radius of circle:"+radius);
		
	}
	public double getArea(){
		double area=22/7*radius*radius;
		System.out.println("Area of circle:"+area);
		return area;
		
		
	}
	public double getCircumference() {
		double circumference=2*22/7*radius;
		System.out.println("circumference of the circle:"+circumference);
		return circumference;
		
	}
	public static void main(String[]args) {
		Circle cir=new Circle();
		cir .getArea();
		cir.getCircumference();
		
	}
	

}
