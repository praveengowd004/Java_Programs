package Triangle_Pattern_Programs;

public class Program9 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=((5-i)+1);j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=(i+i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=(11-i-i);k++)
			{
		
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
