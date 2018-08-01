package com.stackroute.pe1;
import java.util.Scanner;

public class GuessNumber {
public static void main(String args[]) {
	int number=10;
	int a;
	int flag=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Guess a number between 1 to 50");
	a= s.nextInt();
	
	if(a>=1 && a<=50)
	{
			while(flag!=1)
			{
				if(a<number)
				{
					System.out.println("Number guessed is less than original number");
					a= s.nextInt();
					
				}
				else if(a>number)
				{					System.out.println("Number guessed is greater than original number");
					a= s.nextInt();
				 }
				else
				{
					flag=1;
					System.out.println("Number guessed is EQUAL to original number");
				 
				}
						
			}
	}
	else
	{System.out.println("OUT OF RANGE");}
	}

}
