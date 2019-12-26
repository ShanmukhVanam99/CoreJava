package com.to.problems;

import java.util.Scanner;

public class Print1ToN {

	public static void main(String[] args) {
	int i=1;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	sc.close();
	System.out.println("printing the numbers from 1 to n");
	do{
		System.out.println(i);
		i++;
	}while(i<=n);

	}

}
