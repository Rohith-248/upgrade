package LetsLearn;

import java.util.Scanner;

public class Multiplication 
{
	public static void main(String[] args) 
	{
		//static way of creating
		int value1=25;
		int value2=9;
		int result;
		result=value1*value2;
		System.out.println("Multiplication of "+value1+" and "+value2+" is :" + result);
		
		//Dynamic way of creating
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int multiply=num1*num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is :" + multiply);
		
		
	}

}
