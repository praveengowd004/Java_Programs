package FibonacciSeries;

import java.util.Scanner;

public class Fibonacci_Series_App
{

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter range of fibonacci");
		int n=scan.nextInt();
		Fibonacci_Series.fibonacci(n);
		
	}

}
