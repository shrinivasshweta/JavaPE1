package com.stackroute.pe1;
import  java.util.Scanner;

public class DetermineCharacter {
	
		public static void main(String args[])

	    {
	        
	        String w;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter a word:");
	        w=s.next(); 
	        s.close();
	        
	        for(int i=0; i< w.length();i++) {
	        	if((w.charAt(i)>=65 && w.charAt(i)<=90)||(w.charAt(i)>=97 && w.charAt(i)<=120)) {
	        	if(w.charAt(i)=='a'|| w.charAt(i)=='e'||w.charAt(i)=='i'||w.charAt(i)=='o'||w.charAt(i)=='u'||w.charAt(i)=='A'||w.charAt(i)=='E'||w.charAt(i)=='I'||w.charAt(i)=='O'||w.charAt(i)=='U')
	        		System.out.print("Vowel ");
	        	else
	        		System.out.print("Consonent ");
	        }
	        	else
	        		System.out.print("Wrong input ");
	        }	
	        
	    }
	}

