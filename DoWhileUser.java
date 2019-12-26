package com.to.problems;

import java.util.Scanner;

public class DoWhileUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     
        int a, b;
        char c;
        
        do
        {
            System.out.print("Enter the first number ");
            a = sc.nextInt();
          
            System.out.print("Enter the second number ");
             b = sc.nextInt();
            
            int sum = a + b;
            System.out.println("Sum of numbers: " + sum);
        
            System.out.print("Do you want to continue y/n? ");
            c = sc.next().charAt(0);
            
            
            
        }while(c=='y' || c == 'Y');
        sc.close();
    }

	}


