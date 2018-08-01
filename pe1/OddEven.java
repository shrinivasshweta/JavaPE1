package com.stackroute.pe1;	
import  java.util.Scanner;

public class OddEven {

		public static void main(String args[])

	    {
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter number:");
	        n = s.nextInt();
	        s.close();
	        
	        if(n<30 && n>20) {
	        	 if(n%2 !=0)
	        		 System.out.println("Tom");
	        	 else
	        		 System.out.println("Jerry");
	        	
	        }
	        else
	        	System.out.println("Invalid input");
	    }
}
