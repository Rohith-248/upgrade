package LetsLearn;

import java.util.Scanner;

public class AssignmentOperators 
{
	public static void main(String[] args) 
	{
		//static way
		int count=32;
		count +=43;
		System.out.println("Addition = "+count);
		count -=43;
		System.out.println("Subtraction = "+count);
		count *=22;
		System.out.println("Multiplication = "+count);
		count /=4;
		System.out.println("Division = "+count);
		count %=5;
		System.out.println("Modulus = "+count);
		
		//dynamic way
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		number +=43;
		System.out.println("Addition = "+number);
		number -=43;
		System.out.println("Subtraction = "+number);
		number *=22;
		System.out.println("Multiplication = "+number);
		number /=4;
		System.out.println("Division = "+number);
		number %=5;
		System.out.println("Modulus ="+number);
		
	}

}
