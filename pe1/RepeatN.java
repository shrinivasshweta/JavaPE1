package com.stackroute.pe1;
import  java.util.Scanner;

public class RepeatN {
		public static void main(String args[])

	    {
	        String w;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter word to be repeated:");
	        w=s.next(); 
	        System.out.println("Enter no of times:");
	        int n= s.nextInt();
	        s.close();
	        int l=w.length()-n;
	        System.out.print(w);
	        for(int i=1;i<=n;i++) {
	        	for(int j=l;j<w.length();j++) {
	        		System.out.print(w.charAt(j));
	        	}
	        }
	    }
	}
