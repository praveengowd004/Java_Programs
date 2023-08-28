package SumOfDigits;

public class SumOfDigits 
{
	public static void sum(int a)
	{
		int rem;
		int sum=0;
		while(a>0)
		{
			 rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.println("sum of digits of a number is = " + sum);
	}

}
