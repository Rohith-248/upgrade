package LetsLearn;

import java.util.Scanner;

public class DecrementOperators 
{
	public static void main(String[] args) 
	{
		//static way
		int count=10;
		int result=0;
		count--;
		count--;
		count--;
		result=count--;
		System.out.println(result);
		System.out.println(count);
		
		//Dynamic way
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int value=sc.nextInt();
		--value;
		--value;
		--value;
		System.out.println(value);
		
	}

}
