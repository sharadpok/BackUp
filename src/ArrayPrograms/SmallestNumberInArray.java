package ArrayPrograms;

public class SmallestNumberInArray {

	public static void main(String[] args)
	{
		int[]  arr= {3,8,10,9,3,8,12,17,9};
		int temp;
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		if(arr[i]>arr[j])
	    		{
	    		 temp=arr[i];
	    		 arr[i]=arr[j];
	    		 arr[j]=temp;
	    		}
	    		
	    	}
	    
	    }

		System.out.println("Smallest number in array is "+arr[0]);

    	System.out.println("Largest Number is array is :"+arr[arr.length-1]);
    	
    	System.out.println("Second largest number in array is: "+arr[1]);
    	
    	System.out.println("Second largest number in array is: "+arr[arr.length-2]);
    	System.out.println("Printing the array in ascending order");
    	
    	for(int asc:arr)
    	{
    		System.out.print(asc+" ");
    	}
    	
    System.out.println("Prinitng the array in des order");
    for(int k=arr.length-1;k>=0;k--)
    {
    	System.out.print(arr[k]+" ");
    }
	}

}
