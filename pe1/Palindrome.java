package com.stackroute.pe1;
import  java.util.Scanner;

public class Palindrome {
	   
		public static void main(String args[])

	    {
	        int n, m, a = 0,x, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter number:");
	        n = s.nextInt();
	        s.close();
	        
	        m = n;
	        while(n > 0){

	            x = n % 10;
	            a = a * 10 + x;
	            n = n / 10;
	            if(x%2 == 0){
	                  sum = sum + x;
	               }
	        }

	        if(a == m) {
	            if(sum > 25)
	                 System.out.println(m+" is palindrome and the sum of even numbers is greater than 25");
	            else
	            	System.out.println(m+" is palindrome and the sum of even numbers is less than 25");
	        }

	        else
	            System.out.println(m+" is not a palindrome ");
	    }
	}

