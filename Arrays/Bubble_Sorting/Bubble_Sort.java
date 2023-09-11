package bubble_sorting;

public class Bubble_Sort 
{
	public static int[] BubbleSorting(int arr [])
	{
		int temp;
		
		//picking every element of array
		for(int i=0 ; i<=arr.length-2 ; i++)
		{
			
			//comparing element with its next index element
			for(int j=0 ; j<=arr.length-i-2 ; j++)
			{
				
				//if element is greater than next element , then swap
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
