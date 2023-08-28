package ForLoop;
import java.util.Scanner;
public class MultiplictionTable 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("which multiplication table u want");
		int a =scan.nextInt();
		int b;
		System.out.println("the table of "+a);
		for(int i=1;i<=10;i++)
		{
			b =a*i;
			
			System.out.println(a + " X " + i + " = " + b);
		}
	}

}
