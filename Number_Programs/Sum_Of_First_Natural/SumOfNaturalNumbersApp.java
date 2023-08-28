package SumOfNaturalNumbers;

import java.util.Scanner;

public class SumOfNaturalNumbersApp 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("sum of first n natural numbers");
		System.out.println("enter the n valve");
		int a=scan.nextInt();
		SumOfNaturalNumbers.sum(a);

	}

}
