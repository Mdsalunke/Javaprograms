package Java_Programs;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) 
	{
		int num,rem,rev=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 digit number");
		num=sc.nextInt();
		sc.close();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");

		}
	}

}
