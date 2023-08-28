package sum_of_first_N_natural_numbers;

public class SumOfNaturalNumbersApp 
{
	public static void sum(int a)
	{
		int sum=0;
		//checking condition
		for(int b=1;b<=a;b++)
		{
			 sum =sum+b;
		}
		//printing results
		System.out.println(sum);
	}

}
