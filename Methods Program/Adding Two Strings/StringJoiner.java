package adding_two_strings;
import java.util.Scanner;
public class StringJoiner 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two stirngs");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		System.out.println(StringJoinerApp.add(s1,s2));

	}

}
