
public class PrimeNumber {

	public static void main(String[] args)
	{
		int num=15;
		if(num>1)
		{
              label:
              {
            	  if(num==2 | num==3 | num==5| num==7)
            	  {
            		  System.out.println(num+ " is a prime number");
            		  break label;
            	  }
            	  if(num%2==0 | num%3==0 | num%5==0 | num%7==0 )
            	  
            		  System.out.println(num+" is a not prime number");
            	  else
            	  System.out.println(num+" is a prime number");
              }
	}else
	{
		System.out.println("Please enter number greater than one");
	}

}
	}
