package LetsLearn;

public class Calculator 
{
	public static void main(String[] args) 
	{
		calci(5,9);
		
		
	}
	public static void calci(int num1,int num2)
	{
		int add=num1+num2;
		int mul=num1*num2;
		int sub=num1-num2;
		int div=num1/num2;
		System.out.println("Addition = "+add);
		System.out.println("Multiplication = "+mul);
		System.out.println("Subtraction = "+sub);
		System.out.println("Division = "+div);
	}
	

}
