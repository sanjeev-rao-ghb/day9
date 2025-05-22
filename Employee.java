package com.opps.constructor;

public class Employee {

	String name;
	double salary;
	public Employee(String name,double salary) {
         this.name=name;
         this.salary=salary;
         
	}
	public void displayDetails() {
		if(salary<0)
		{
			salary=0;
		}
		System.out.println("Name of tha employee:"+name);
		System.out.println("Salary of employee:"+salary);
		
	}
	public static void main(String[]args) {
		Employee emo=new Employee("Sanjeev",30000);
		emo.displayDetails();
	}

}
