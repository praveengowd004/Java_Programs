package double_of_a_number;

import java.util.Scanner;

public class Double_Of_Number {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number which you want to make it double");
		int num = scan.nextInt();
		int a=Double_Of_Number_App.DoubleTheNum(num);
		System.out.println(a);

	}

}
