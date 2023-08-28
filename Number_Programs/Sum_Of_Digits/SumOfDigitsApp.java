package SumOfDigits;

import java.util.Scanner;

public class SumOfDigitsApp 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number which you want to find sum of their digits");
		int a =scan.nextInt();
		SumOfDigits.sum( a);

	}

}
