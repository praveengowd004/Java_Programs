package even_numbers;
import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("until where you want to print even numbers  from zero ");
		//storing valve
		int a =scan.nextInt();
		System.out.println("even numbers from zero to "+ a);
		
		EvenNumbersApp.even(a);

	}

}
