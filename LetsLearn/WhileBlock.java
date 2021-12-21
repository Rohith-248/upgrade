package LetsLearn;

public class WhileBlock 
{
	public static void main(String[] args) 
	{
		int i=1,n=5;
		
		while(i<=n)
		{
			if(i==4)
				continue;
			i++;
			System.out.println(i);
		}
		
		System.out.println("While block");
	}

}
