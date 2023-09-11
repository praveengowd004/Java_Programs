package insertion_sorting;

import java.util.Scanner;

public class Insertion_Sort_App
{

	public static void main(String[] args) 
	{
		//creating of an array
		Scanner scan = new Scanner(System.in);
		System.out.println("enter length of an array");
		int arr[] = new int[scan.nextInt()];
		
		//storing elements into the array
		System.out.println("enter " + arr.length + " elements to be store in array");
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		//displaying array before sorting
		System.out.println("array before sorting");
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		//calling method
		Insertion_Sorting.sorting(arr);
		

	}

}
