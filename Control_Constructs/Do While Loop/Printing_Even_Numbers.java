package DoWhile;

import java.util.Scanner;

public class Printing_Even_Numbers {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num which you want to find even numbers from 0 to that number");
		int num = scan.nextInt();
		
		int i=1;
		do
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
				//i++;
				
				else if (i%2==-1)
				{
					System.out.println(i);
				}
			i++;
		
		}
		while(i<=num);

	}

}
