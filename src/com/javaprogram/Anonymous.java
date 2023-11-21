package com.javaprogram;

public interface Anonymous {
	void show();
	//void num(int x);
	static void print() {
		System.out.println("i am static mathod");
	} 
	default void display() {
	System.out.println("it is default method");
	}

}
