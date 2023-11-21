package com.lamdaexpresion;

public interface Interface {
	public void add();
	public void sub();
	default void m1() {
		 System.out.println("hhhh");
	}

}

