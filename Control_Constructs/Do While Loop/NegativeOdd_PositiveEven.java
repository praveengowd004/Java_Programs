package DoWhile;

public class NegativeOdd_PositiveEven 
{

	public static void main(String[] args) 
	{
		
		int i=-100;
		do
		{
			//printing all negative odd numbers from 0 to -100
			if(i<0 && i%2==-1)
			{	
			System.out.println(i);
			
			}
			
			//printing all positive even numbers from 0 to 200
			else if(i>0 && i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		while(i<=200);
	}

}
