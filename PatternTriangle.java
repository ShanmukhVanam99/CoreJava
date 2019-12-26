package com.to.problems;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		int i,j,k,rows,count,temp=1;
	    System.out.println("Enter number of rows:");	
	    Scanner sc=new Scanner(System.in);
	    rows= sc.nextInt();
	    sc.close();
	    count=rows-1;
	    for(i=1;i<=rows;i++)
	    {
	        for(j=1;j<=count;j++)
	        {
	        	System.out.print(" ");

	        }
	        for(k=1;k<=temp;k++)
	        {
	        	System.out.print(i);
	        }
	        count--;
	        temp+=2;

	        System.out.print("\n");
	    }

	}

}
