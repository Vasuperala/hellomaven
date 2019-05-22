package com.vasu;

import java.util.Scanner;

public class App
{ 
	public static void main(String[] args)
	{ 
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("**********SUM OF 2 NUMBERS******** ");
        System.out.println("Enter Number A: "); 
        a=sc.nextInt();
        System.out.println("Enter Number B: "); 
        b=sc.nextInt();
        c = a+b;
        // using for each loop to display contents of a 
        System.out.println("Sum of A & B: "+c); 
	}
} 