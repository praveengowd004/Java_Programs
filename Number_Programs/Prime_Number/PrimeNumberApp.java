package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberApp {

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a num which you want to print prime numbers upto that number");
		int n=scan.nextInt();
		System.out.println("prime numbers from 0 to" + n);
		PrimeNumber.prime(n);
		

	}

}
