package com.java8;

public class TestClass implements InterFace{
	
	public void bicke(String fule , int avrege) {
		System.out.println("Car start");
	    System.out.println(fule);
	    System.out.println(avrege);
	}
	public void car (String s , String y ) {
		System.out.print(s);
		System.out.println(y);
	}
	public void scutor(String brand) {
		System.out.println(brand);
		
	}
	public static void main(String[] args) {
		
		TestClass ts= new TestClass();
		ts.m1();
		ts.car("hero" , "honda");
		ts.bicke(" capisity => ten Leter", 50);
		ts.scutor("honda");
	}
	

}
