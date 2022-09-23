package Java_Programs;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) 
	{
		int temp,rem,num,res=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a 3 digit number");
		num=sc.nextInt();
		sc.close();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			res=res+rem*rem*rem;
			//res=(int)(res+Math.pow(rem,3));
			num=num/10;
		}
		if(res==temp)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Number is not Armstrong no.");

		}
	}

}
