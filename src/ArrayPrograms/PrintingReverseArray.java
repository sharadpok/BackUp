package ArrayPrograms;

public class PrintingReverseArray {

	public static void main(String[] args)
	{
		int[] arr= {2,5,7,5,9,1,45};
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
