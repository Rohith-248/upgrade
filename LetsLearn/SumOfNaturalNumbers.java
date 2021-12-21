package LetsLearn;

public class SumOfNaturalNumbers 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum Of First Five Natural Numbers = "+sum);
		System.out.println("Average Of First Five Natural Numbers = "+sum/5);
	}

}
