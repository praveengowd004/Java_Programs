package number_pattern_programs;

public class Program4 
{

	public static void main(String[] args)
	{
		int z=1;
		for(int i=1;i<=4;i++)
		{
			
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i+i)-1;j++)
			{
				
				if(j==2 || j==4 || j==6)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print(z);
				z++;
				}
			}
			System.out.println();
		}

	}

}
