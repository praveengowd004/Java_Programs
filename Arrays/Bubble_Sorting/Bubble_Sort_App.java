package bubble_sorting;

import java.util.Scanner;

public class Bubble_Sort_App
{

	private Object sortedarray;

	public static void main(String[] args)
	{
		//creating array
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int arr[] = new int[scan.nextInt()];
		
		//storing elements
		System.out.println("enter "+ (arr.length) + " elements to be store");
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		//displaying array before sorting
		System.out.println("array before sorting");
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//calling BubbleSorting()
		int sortedarray[]=Bubble_Sort.BubbleSorting(arr);
		
		//displaying array after sorting
		System.out.println("array after sorting");
		for(int i=0 ; i<=sortedarray.length-1 ; i++)
		{
			System.out.print(sortedarray[i]+ " ");
		}

	}

}
