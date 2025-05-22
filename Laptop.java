package com.opps.constructor;

public class Laptop {

	String brand;
	int ramSize;
	
	
public Laptop(String brand,int ramSize) {
	this.brand=brand;
	this.ramSize=ramSize;
	
}
public Laptop() {
      brand="Dell";
      ramSize=16;
}
public void showSpece() {
	System.out.println("Laptop brand :"+brand);
	System.out.println("Laptop size is :"+ramSize);
	
}

public static void main(String[]args) {
	Laptop lap=new Laptop();
	lap.showSpece();
	Laptop lap1=new Laptop();
	lap1.showSpece();
}
	

}
