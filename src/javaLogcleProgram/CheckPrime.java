package javaLogcleProgram;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		if(a%2==0) {
		System.out.println("it is not a prime  num");
		
		}
		else
		{
			System.out.println("this value is  prime num");
		}
		System.out.println("thanks for give the time");
	}

}
