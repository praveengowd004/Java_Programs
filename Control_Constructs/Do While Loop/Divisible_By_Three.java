package DoWhile;

import java.util.Scanner;

public class Divisible_By_Three {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("sum of first n numbers which are divisible by 3");
		System.out.println("enter n valve");
		int num = scan.nextInt();
		int sum=0;
		int i=1;
		do
		{
			if(i%3==0)
			sum=sum+i;
			i++;
		}
		while(i<=num);
		System.out.println("the sum = " + sum);
	}
	
}
