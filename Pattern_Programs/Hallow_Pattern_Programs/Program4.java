package Hallow_Pattern_Programs;

public class Program4 
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
				if(i==1 || i==5 || (i==2&&k==1) || (i==2&&k==3) ||(i==3&&k==1)||(i==3&&k==5)||(i==4&&k==1)||(i==4&&k==7))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
						
			}
		
			System.out.println();
		}
		
	}

}
