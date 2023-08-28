package PrimeNumber;

public class PrimeNumber 
{
	public static void prime(int a)
	{
		for(int i=2;i<=a;i++)
		{
			int count=0;
			for(int j=1;j<=a;j++)
			{
				if(i%j==0)
				{
					count=count+1;	
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}

}
