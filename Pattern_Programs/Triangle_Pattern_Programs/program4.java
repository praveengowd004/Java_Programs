package Triangle_Pattern_Programs;

public class program4 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=((5-i)+1);j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i+i-1);k++)
			{
					System.out.print("*");
						
			}
		
			System.out.println();
		}

	}

}
