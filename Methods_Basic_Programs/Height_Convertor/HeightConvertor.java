package height_convertor;

import java.util.Scanner;

public class HeightConvertor {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("enter height in inches ");
		float inches = scan.nextFloat();
		HeightConvertorApp converter = new HeightConvertorApp();
		double a = converter.HeightConvert(inches);
		System.out.println(inches + " inches height in feets = " + a);

	}

}
