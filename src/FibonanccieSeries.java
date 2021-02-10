
public class FibonanccieSeries {

	public static void main(String[] args)
	{
		int n0=0;
		int n1=1;
		int res;
		int count=10;
		System.out.print(n0+" "+n1+" ");
        for(int i=2;i<count;i++)
        {
        	res=n0+n1;
        	System.out.print(res+" ");
        	n0=n1;
        	n1=res;
        }
	}

}
