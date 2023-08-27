package area_of_rectangle;
import java.util.Scanner;
public class rectangle_area_app 
{

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		//taking input from user
		System.out.println("enter width of rectangle to calculate area");
		double a =scan.nextInt();
		System.out.println("enter length of rectangle to calculate area");
		double b=scan.nextInt();
		//calling a method
		double c =RectangleArea.CalculateRectangleArea(a,b);
		System.out.println("area of rectangle is = "+c);
		

	}

}
