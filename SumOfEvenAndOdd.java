package com.to.problems;

import java.util.Scanner;

public class SumOfEvenAndOdd {


	public static void main(String[] args) {
	
	int i, n,even=0,odd=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of elements");
	n= sc.nextInt();
	int[] a =new int[n];
	System.out.println("enter the elements of array");
	for( i = 0; i < n; i++)
    {
        a[i] = sc.nextInt();
    }
	sc.close();
    for( i = 0; i < n; i++)
    {
        if(a[i] % 2 == 0)
        {
            even+=a[i];
        }
        else
        {
           odd+=a[i];
        }
    }
    System.out.println("Sum of Even Numbers:"+even);
    System.out.println("Sum of Odd Numbers:"+odd);
	}

}
