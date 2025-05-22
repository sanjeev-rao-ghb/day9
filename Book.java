package com.opps.constructor;

public class Book {

	String title;
	String author;
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
		
	}
	public void display() {
		System.out.println("title:"+title);
		System.out.println("author:"+author);
	}
	public static void main(String[]args) {
		Book bo=new Book("RAJA YOJA","SWAMY VIVEKANANDA");
		bo.display();
		
	}
	}
