package Largest_Digit_In_a_Number;

import java.util.Scanner;

public class LargestDigitApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		
		int largestnum = LargestDigit.LargestDigit(num);
		System.out.println("the largest digit in a number "+ num +" is "+ largestnum );
			
	}

}
