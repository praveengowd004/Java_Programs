package Largest_Digit_In_a_Number;

public class LargestDigit
{
	public static int LargestDigit(int num)
	{
		int LargestDigit = 0;
		int rem;
		while(num>0)
		{
			rem = num%10;
			if(rem > LargestDigit)
			{
				LargestDigit=rem;
			}
			num=num/10;
		}
		return LargestDigit;
	}

}
