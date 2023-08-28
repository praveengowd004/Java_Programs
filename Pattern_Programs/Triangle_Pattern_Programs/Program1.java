package Triangle_Pattern_Programs;

public class Program1 
{

	public static void main(String[] args) 
	{
		
		/*
		 for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=5)
			{
				System.out.print(" ");
				k++;
			}
			
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
