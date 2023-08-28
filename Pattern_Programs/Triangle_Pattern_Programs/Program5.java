package Triangle_Pattern_Programs;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n valve");
		int i =scan.nextInt();
		System.out.println("what has to be printed");
		char ch=scan.next().charAt(0);
		
		/*
		for(int j=1;j<=i;j++)
		{
			for(int n=1;n<=j;n++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		
		int j=1;
		while(j<=i)
		{
			int n=1;
			while(n<=j)
				{
					System.out.print(ch);
					n++;
				}
			System.out.println();
			j++;
		}

	}

}
