package Java_Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a no. to calculate factorial");
		n=sc.nextInt();
		sc.close();
		if(n==0)
		{
			System.out.println("Factorial of 0 =1");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+n+"="+fact);
		}
		
		
	}

}
