package Triangle_Pattern_Programs;

import java.util.Scanner;

public class Program6 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n valve");
		int n =scan.nextInt();
		System.out.println("what has to be printed");
		char ch=scan.next().charAt(0);
		
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=((n-i)+1);j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=( (n-i)+1) )
			{
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
