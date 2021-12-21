package LetsLearn;

import java.util.Scanner;

public class GreatestNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Find the Greatest of Three Number");
		System.out.println("Enter the First Number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2=sc.nextInt();
		System.out.println("Enter the Third Number");
		sc.close();
		int num3=sc.nextInt();
		if(num1>num2&&num1>num3)
			System.out.println("Greatest Number is = "+num1);
		else if(num2>num1&&num2>num3)
			System.out.println("Greatest Number is = "+num2);
		else
			System.out.println("Greatest Number is = "+num3);
			
		
	}

}
