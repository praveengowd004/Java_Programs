package sum_of_first_N_natural_numbers;
import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		//taking input from user
		System.out.println("sum of first n natural numbers");
		System.out.println("enter n valve");
		//storing valve into a variable
		int a =scan.nextInt();
		System.out.println("sum of first "+ a + " natural numbers");
		SumOfNaturalNumbersApp.sum(a);

	}

}
