package LetsLearn;

import java.util.Scanner;

public class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Multiplication Table");
		System.out.println("Enter a Number");
		int table=sc.nextInt();
		sc.close();
		int multiplication=1;
		for(int i=1;i<=10;i++)
		{
			multiplication=table*i;
			System.out.println(table+"*"+i+"="+multiplication);
		}
	}

}
