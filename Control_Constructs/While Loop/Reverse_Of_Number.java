package WhileLoop;

import java.util.Scanner;

public class Reverse_Of_Number {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("enter a number ");
		int i =scan.nextInt();
		System.out.println("reverse of " + i + " is");
		while(i>0)
		{
			int rev=i%10;
			System.out.print( rev);
			i=i/10;
		}

	}

}
