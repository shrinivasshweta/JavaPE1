
package com.stackroute.pe1;
import  java.util.Scanner;

public class Sorting {

		public static void main(String args[])

	    {
	        int sum=0,i=0,temp;
	        int[] a= new int[50];
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter no");
	        int n= s.nextInt();
	        s.close();
	        
	        do {
	        	 a[i] = n%10;
	        	 i++;
	        	 n = n/10;
	        }while(n>0);
	        
	        for (int k = 0; k < i; k++) {
	         for (int j = k + 1; j < i; j++){
	             if (a[k] < a[j]) {
	            	 temp = a[k];
	                 a[k] = a[j];
	                 a[j] = temp;
	               }
	          }
	       }
	        System.out.print("Sorted number in non-increasing order :");
	        for (int k = 0; k < i; k++) {
	        	System.out.print(a[k]);
	        	
	        	if(a[k]%2 == 0)
	        		sum = sum+ a[k];
	        }
	        System.out.println("");
	        System.out.println(" Sum of even numbers :"+sum);
	        if(sum > 15)
	        	System.out.println("True")	;
	        else
	        	System.out.println("False");
	        
	    }
	}

