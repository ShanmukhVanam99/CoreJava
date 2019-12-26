package com.to.cj2;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		int a,b,c;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a value");
		 a=sc.nextInt();
		 System.out.println("enter b value");
		 b=sc.nextInt();
		 System.out.println("enter c value");
		 c=sc.nextInt();
		 sc.close();
		 if(a>b)
		 {
			 if(a>c)
			 {
				 System.out.println("a is the biggest number");
			 }
		 }
		
		 else if(b>c)
		 {
			 System.out.println("b is the biggest number");
		 }
		 else
		 {
			 System.out.println("c is the biggest number");
		 }
		 }
	
	

	
}


