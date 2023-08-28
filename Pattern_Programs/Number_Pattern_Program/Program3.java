package number_pattern_programs;

public class Program3 
{

	public static void main(String[] args) 
	{
		int z=1;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5;k++)
			{
				if(z<10)
				{
					System.out.print("0"+z +" ");
				}
				else
				{
				System.out.print( z +" ");
				}
				z=z+1;
			}
			System.out.println();
		}

	}

}
