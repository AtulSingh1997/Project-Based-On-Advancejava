package javaLogcleProgram;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter the any  num");
		Scanner sc= new Scanner (System.in);
       int a= sc.nextInt();
		if(a%2==0) {
			System.out.println("this is even num");
			
		}
		else
		System.out.println("it is odd num");
	}

}
