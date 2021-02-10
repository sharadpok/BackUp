
public class ArmstrongNumber {

	public static void main(String[] args)
	
	{
		int num=153;
		int res=0;
		int lastDigit;
		int temp=num;
		while(num>0)
		{
			 lastDigit=num%10;
			 num=num/10;
			 res=res+(lastDigit*lastDigit*lastDigit);
		}
		if(temp==res)
		System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");

	}

}
