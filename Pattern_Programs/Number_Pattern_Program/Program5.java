package number_pattern_programs;

public class Program5 
{

	public static void main(String[] args) 
	{
		int z=25;//5*5
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5;k++)
			{
				z--;
				if(z<10)
				{
					System.out.print("0"+z + " ");
				}
				else
				{
					System.out.print(z+ " ");
				}
			}
			System.out.println();
		}

	}

}
