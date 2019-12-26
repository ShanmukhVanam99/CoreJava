package com.to.cj3;

import java.util.Scanner;

public class DoWhilePattern {

	public static void main(String[] args) {
		int i=0,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		do                                                                
		   {                                                                          
			System.out.println("   ");                                                          
		      j=0;                                                                    
		      do                                                             
		       {                                                                      
		    	  System.out.print(" * ");                                                       
		         j++;                                                                 
		       }while(j<=i);                                                                     
		       System.out.println("");                                                          
		       i++;                                                                   
		   }while(i<n);
		sc.close();

	}

}
