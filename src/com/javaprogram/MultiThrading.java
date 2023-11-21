package com.javaprogram;

public class MultiThrading {
	public void method1(int a, int b) {
		System.out.println(1223+" "+899898);
		
	}
	public static void main(String[] args) {
		MultiThrading r= new MultiThrading();
		Thread t= new Thread();
		Thread t1= new Thread();
		t.start();
		t1.start();
		
		for(int i= 0;i<=10;i++){
		System.out.println("this is multithrading");
		}
		 for(int j=1;j<=15;j++) {
		 System.out.println("yes i am interested you");
		
		}
		r.method1(12,12);
	}

}
