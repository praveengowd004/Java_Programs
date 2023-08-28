package table;
import java.util.Scanner;//importing scanner
public class Table {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number which u want to print table  ");
		int a =scan.nextInt();//storing vlave into variable
		System.out.println("table of "+a+" is ");
		Table_App.table(a);//calling method

	}

}
