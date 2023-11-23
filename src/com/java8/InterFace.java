package com.java8;

public interface InterFace {
	public void car(String s, String y);
	public void bicke (String fule ,int avrege);
	public void scutor(String brand);
	default void m1() {
		System.out.println("hii i am default method ");
		
	}
	static void m2()
	{
		System.out.println("hi i am static method ");
	}
}
