package SumOfNaturalNumbers;

public class SumOfNaturalNumbers
{
	public static void sum(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;	
		}
		System.out.println("sum of first " + a + " natural num is = " + sum);
	}
}
