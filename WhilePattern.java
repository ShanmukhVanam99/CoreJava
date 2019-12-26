package com.to.cj3;

import java.util.Scanner;

public class WhilePattern {

	public static void main(String[] args) {
	int i=1,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	while(i<=n)                                                                
	   {                                                                          
		System.out.println("   ");                                                          
	      j=1;                                                                    
	      while(j<=i)                                                             
	       {                                                                      
	    	  System.out.print(" * ");                                                       
	         j++;                                                                 
	       }                                                                      
	       System.out.println("");                                                          
	       i++;                                                                   
	   } 
	sc.close();

	}

}
