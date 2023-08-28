package FibonacciSeries;

public class Fibonacci_Series 
{
	public static void fibonacci(int a) 
	{
		int i=1;
		int j=1;
		int fib=1;
		for(int k=0;k<a;k++)
		{
			if(k==0)
			{
				System.out.println("0");
			}
			else if(k==1)
			{
				System.out.println("1");
			}
			else 
			{
				
				fib=i+j;
				System.out.println(fib);
				i=j;
				j=fib;
				
					
			}
		
		}

		
			
	}

}
