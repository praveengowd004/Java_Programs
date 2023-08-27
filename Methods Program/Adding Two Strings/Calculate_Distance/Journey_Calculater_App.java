package calculating_distance;

import java.util.Scanner;

public class Journey_Calculater_App {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter speed in kmph");
		float speed = scan.nextFloat();
		System.out.println("enter time in hours");
		float time = scan.nextFloat();
		JourneyCalculator journeyCalculator =new JourneyCalculator();
		double res=journeyCalculator.calculateDistance( speed , time);
		System.out.println(res + "km is the total distance travelled by you");
	}

}
