package com.stackroute.pe1;

import  java.util.Scanner;

public class CheckLoop {
		public static void main(String args[])

	    {
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter no");
	        n = s.nextInt();
	        s.close();
	        
	        for(int i=1;i<=n;i++) {
	        	for(int j=1;j<=i;j++) {
	        		System.out.print(i);
	        	}
	        }
	    }
	}
