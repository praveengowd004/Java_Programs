package arethmatic_operations;
import java.util.Scanner;
public class ArethmaticOperations
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		ArethmaticOperationApp a=new ArethmaticOperationApp();
		
		System.out.println("addition of two numbers is = " +(a.add(num1, num2)));
		System.out.println("multiplication of two numbers is = "+a.mul(num1 , num2));
		System.out.println("subtraction of two numbers is = " + a.sub(num1, num2));
	}

}
