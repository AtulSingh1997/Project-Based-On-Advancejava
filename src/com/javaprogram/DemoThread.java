package com.javaprogram;

public class DemoThread  extends Thread{
	public void run() {
		System.out.println("i am run method ");
		for (int i = 1; i <=15; i++) {
			System.out.println("this is a botle");
		}
		for(int j= 1;j<=15;j++) {
			System.out.println("hiii how are you");
		}
		
	}
	public static void main(String[] args) {
		DemoThread  d= new DemoThread ();
		Thread t = new Thread (d);
		t.start();
		t.run();
		
	}

}
