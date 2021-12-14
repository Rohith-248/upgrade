package javaprogramming;

class BlocksDemo
{
	//static block is created using static keyword
	static
	{
		System.out.println("Im inside static block of BlocksDemo");
	}
	
	//non-static block is created
	{
		System.out.println("Im inside non-static block of BlocksDemo");
	}
}


public class BlocksOfJava
{
	//static block
		static
		{
			System.out.println("Im inside static block of Blocks");
		}
		
		//non-static block
		{
			System.out.println("Im inside non-static block of Blocks");
		}
		
		public static void main(String[] args) 
		{
			System.out.println("Im Main Method");
			new BlocksDemo();//object created for blocksdemo class
			new BlocksOfJava();//object created for blocks class
		}


}
