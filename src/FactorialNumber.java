
public class FactorialNumber {

	public static void main(String[] args)
	{
		int num=5;
		int res=1;
		for(int i=num;i>=1;i--)
		{
			res=res*i;
		}
		System.out.println("Factorial of "+num+" is "+res);

	}

}
