package Triangle_Pattern_Programs;

public class program3 
{

	public static void main(String[] args) 
	{
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=( (5-i)+1);j++ )
			{
				System.out.print("-");
			} 
			for(int k=1;k<=i;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j< ((5-i)+1) ) 
			{
				System.out.print(" ");
				j++;
			}
			
			int k=1;
			while(k<=i)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
					
		}

	}

}
