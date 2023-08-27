package even_numbers;

public class EvenNumbersApp 
{
	public static void even(int a)
	{
		//checking outer loop condition
		for(int b=1;b<=a;b++)
		{
			//checkin inner loop condition
			if(b%2==0)
			{
				System.out.println(b);
			}
		}
	}

}
