package com.pack1;

public class Test implements Vecle{
	public void car() {
		System.out.println("Start car");
	}
		 void method1(String s,int a)
		{
			System.out.println(s+" "+a);
		}
		
	
	public void bus () {
		System.out.println("Start bus");
	}
	public void truck() {
		System.out.println("Start truck");
	}
	public static void main(String[] args) {
		Vecle vc=new Test();
		Test ts= new Test();
		ts.method1("lajabab",101);
		vc.car();
		vc.bus();
		vc.truck();
	}
	

}
