package LetsLearn;

public class AddingOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		AddingOfTwoNumbers at=new AddingOfTwoNumbers();
		
		int res=at.sum(5,9);
		System.out.println(res);
		
	}
	public int sum(int n1,int n2)
	{
		int result=n1+n2;
		return result;
	}

}
