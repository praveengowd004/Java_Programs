package insertion_sorting;

public class Insertion_Sorting 
{
	public static void sorting(int arr[] )
	{
		for(int i=1 ; i<=arr.length-1 ; i++)
		{
			int item = arr[i];
			int j=i-1;
			while(j >= 0 && arr[j] > item )
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
		
		//displaying sorted array
		System.out.println("array after sorting");
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
