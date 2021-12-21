package LetsLearn;

import java.util.Scanner;

public class NumberOfDays 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Days in a  Month");
		System.out.println("1.jan\t2.feb\t3.mar\t4.april\t5.may\t6.jun\t7.jul\t8.aug\t9.sep\t10.oct\t11.nov\t12.dec");
		System.out.println("Choose your Month");
		int month=sc.nextInt();
		sc.close();
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:System.out.println("Number of days are 31");
					break;
			case 2:System.out.println("Number of days are 28 or 29");
					break;
			
			case 4:
			case 6:
			case 9:
			case 11:System.out.println("Number of days are 30");
					break;
			default:System.out.println("Number is Invalid");
		}
		
	}

}
