package com.javaprogram;

public class MainClass {
	public static void main(String[] args) {
		
		/*Anonymous obj= new Anonymous() {
		public void show() {
			System.out.println("Hello i am Anonymous class");
		}
		public void num(int x) {
			System.out.println(x);
		}
		
		};
		obj.show();
		obj.num(33);*/
		//lamda exeprison ka use krke   
		Anonymous lamda=()->{
			System.out.println("Hello oo");
			
		};
		lamda.show();
	}

}
