
public class IntegerPalindrome {

	public static void main(String[] args)
	{
		int num=767;
		int res;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			res=num%10;
			num=num/10;
			sum=res+(sum*10);
		}
		if(temp==sum)
		System.out.println(temp+" is a integer palindrome");
		else
			System.out.println(temp+" is not a integer palindrome");
	}

}
