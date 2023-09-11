package selection_sorting;

import java.util.Scanner;

public class Selection_Sort_App 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int arr[] = new int[scan.nextInt()];
		
		System.out.println("enter " + arr.length + " elements to be store in array");
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("array before sorting");
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int SortedArray[] = Selection_Sort.SelectionSorting(arr);
		
		System.out.println("array after sorting");
		for(int i=0 ; i<=SortedArray.length-1 ; i++)
		{
			System.out.print(SortedArray[i] + " ");
		}
		
		

	}

}
