package javaLogcleProgram;

import java.util.Scanner;

public class PrintNumber {
	public static void main(String[] args) {
		System.out.println("Enter the any num");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		for(int i=0;i<=a;i++) {
			System.out.println(i);
		}
	}
}