package temperature_convertor;

import java.util.Scanner;

public class TempConvertorApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter temperature in fahrenheit ");
		int a = scan.nextInt();
		TempConvertor temperatureConverter = new TempConvertor();
		double temp = temperatureConverter.convert(a);
		System.out.println("temperature in cenntigrade = " + temp);
		

	}

}
