package Palindrome;

import java.util.Scanner;

public class PalindromeApp 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("enter a number to check wether it is palindrome or not ");
		int num = scan.nextInt();
		Palindrome palindrome = new Palindrome();
		palindrome.reverse(num);

	}

}
