package ArrayPrograms;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) 
	{
		int[] arr= {2,3,4,5,6,7,8,9};
		// wanted to remove element at index 1 i.e- 3
		int removeIndex=1;
		System.out.println("Original array: "+Arrays.toString(arr));
		for(int i=removeIndex; i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
			
		}
        System.out.println("After removing second element: "+Arrays.toString(arr));
	}

}
