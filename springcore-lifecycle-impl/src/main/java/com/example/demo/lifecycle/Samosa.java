package com.example.demo.lifecycle;

public class Samosa {
	
	private double price;

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	 public void init()
	 {
		 System.out.println("Inside init method");
	 }
	 
	 public void destroy()
	 {
		 System.out.println("Inside destroy method");
	 }

}
