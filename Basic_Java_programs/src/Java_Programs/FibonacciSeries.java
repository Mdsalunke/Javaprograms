package Java_Programs;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int a=0,b=1,c,n=6;
		
		for(int i=0;i<=n;i++)
		{
			System.out.println(a+" ");
			c=a+b;
			//System.out.println(c);
			a=b;
			b=c;
			//System.out.println(c);
		}
		
	}

}
