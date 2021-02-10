package ArrayPrograms;

public class DuplicateNumbersInArray {

	public static void main(String[] args)
	{
	    int[]  arr= {3,8,10,9,3,8,12,17,9};
	    System.out.print("Duplicate elements are: ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		if(arr[i]==arr[j])
	    			System.out.print(arr[i]+" ");
	    		
	    	}
	    	
	    }

	}

}
