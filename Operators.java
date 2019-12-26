package com.to.cj3;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		int a,b,c,n=0;
		Scanner sc=new Scanner(System.in);
System.out.println("enter the value ofa");
a=sc.nextInt();
System.out.println("enter the value ofb");
b=sc.nextInt();
System.out.println("enter the value ofc");
c=sc.nextInt();
sc.close();
System.out.println("arithmatic operators");
n=a+b;
System.out.println("sum is: "+n);
n=a-b;
System.out.println("sub is: "+n);
n=a*b;
System.out.println("mul is: "+n);
n=a/b;
System.out.println("div is: "+n);
n=a%b;
System.out.println("mod is: "+n);
System.out.println("unary operators");
n=++a;
System.out.println("increament of a is: "+n);
n=--b;
System.out.println("decreament of b is: "+n);
System.out.println("Assignment operators");
n+=b;
System.out.println("n assigned with (n+b)"+n);
System.out.println("relational operators");
if(a==b)
{
	System.out.println("a and b are equal");
}
else
	System.out.println("a and b are not equal");
System.out.println("logical operators");

if((a>b)&&(a>c))
{

	System.out.println("a is the highest number");
	}
System.out.println("a&b = " + (a & b)); 
System.out.println("a|b = " + (a | b)); 

System.out.println("a^b = " + (a ^ b)); 
System.out.println("~a = " + ~a); 
a &= b; 
System.out.println("a= " + a); 
System.out.println("terinary operators");
n=(a<b)?a:b;
System.out.println(n+" is the smallest");

}
}
