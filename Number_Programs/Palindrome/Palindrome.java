package Palindrome;

public class Palindrome 
{
	public static void reverse(int a)
	{
		int rem;
		int reverse =0;
		int temp =a;
		while(temp>0)
		{
			rem=temp%10;
			reverse = reverse * 10 + rem;
			temp=temp/10;
			
		}
		if(reverse == a)
		{
			System.out.println(a+ " is a palindrome number");
		}
		else
		{
			System.out.println(a+ " is not a palindrome number");
		}
	}

}
