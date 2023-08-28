package Basic_Pattern_Programs;

import java.util.Scanner;

public class program5 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n valve");
		int i =scan.nextInt();
		System.out.println("what has to be printed");
		char ch=scan.next().charAt(0);
		
		int k=1;
		while(k<=i)
		{
			for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
				}
			for(int j=1;j<=i;j++)
				{
					//printing character in rectangle shape
					System.out.print(ch);
				}
			System.out.println();
			k++;
		}
		
	}

}
