package Basic_Pattern_Programs;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n valve");
		int i =scan.nextInt();
		System.out.println("what has to be printed");
		char ch=scan.next().charAt(0);
		
		for(int j=1;j<=5;j++ )
		{
			for(int n=1;n<=i;n++)
			{
				//printing character a sqaure shape
				System.out.print(ch + " ");
			}
			System.out.println();
		}

	}

}
