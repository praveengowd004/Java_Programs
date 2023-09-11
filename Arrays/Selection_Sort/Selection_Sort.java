package selection_sorting;

public class Selection_Sort 
{
	public static int[] SelectionSorting (int arr[])
	{
		int temp=0;
		
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			int min=i;
			
			for(int j=i+1 ; j<=arr.length-1 ; j++)
			{
				if(arr[j] < arr[min])
				{
					min=j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
			
		return arr;
		
		
	}

}
