package javaLogcleProgram;

import java.util.Scanner;

public class SumPrime {
	public static void main(String[] args) {
		//System.out.println("enter");
		 Scanner	scn=new	Scanner(System.in);
		 System.out.println("Enter	the	range	to	print	sum	of	prime	Nos.....");
		 int sum=0;
		 int renge= scn.nextInt();
		 for(int i=1;i<=renge;i++) {
			 if(i%2==0)
			 {
				 System.out.println("does not prime no");
				 sum= sum+i;
			 }
			 else
				 System.out.println("this is prime num");
			 System.out.println(i);
			  sum=sum+i;
			 
		 }
		 
	}
}
