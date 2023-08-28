package ForLoop;

import java.util.Scanner;

public class Factorial 
{
public static void main (String[]args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number which you want to find factorial");
	int k = scan.nextInt();
	int i=1;
	int j=1;
	for (i=1;i<=k;i++)
	{
		 j = j*i; 
	}
	 System.out.println("factorial of " + k + " is " + j);
}
}