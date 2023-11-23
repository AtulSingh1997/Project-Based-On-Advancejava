package com.constructor;

public class Cons {
	Cons(){
		System.out.println("constructor"
				+ ""
				+ "");
		Cons co = new Cons();
	}
	public void sum(int a, int b) {
		System.out.println("sum of the two number"+ (a+b));
	}
	public static void main(String[] args) {
		System.out.println("hii i am main method");
		Cons col = new Cons();
		col.sum(5,6);
		col.multi(2,5);
		System.out.println("hllo");
	}
	static void multi(int a , int b) {
		System.out.println(a*b);
	}
	
}
