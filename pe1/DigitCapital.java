package com.stackroute.pe1;
import java.util.Scanner;


public class DigitCapital {

		public static void main(String args[])
	    {
			int i=0;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter character:");
	        String a=s.next(); 
	        s.close();
	        
	        if(a.charAt(i) >= 65 && a.charAt(i) <= 90)
	        	System.out.print("Capital letter ");
	        else if(a.charAt(i)>=97 && a.charAt(i)<=120)
	        	System.out.print("Small case letter ");
	        else if(a.charAt(i)>=48 && a.charAt(i)<=57)
	        	System.out.println("Digit");
	        else
	        	System.out.println("Special symbol");
	  
	    }
	}

