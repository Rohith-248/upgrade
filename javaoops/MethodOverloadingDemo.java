package javaoops;

public class MethodOverloadingDemo 
{
	//methodoverloading is having multiple methods with same method name but with different singnatures.
	//method instagram of no parameters
	public static void instagram()
	{
		System.out.println("welcome to instagram");
	}
	//method instagram of int parameter
	public static void  instagram(int num)
	{
		System.out.println("connect to billions of people");
	}
	//method instagram of string parameter
	public static void instagram(String topic)
	{
		System.out.println("follow the trending topics over the globe");
	}
	public static void main(String[] args)
	{
		System.out.println("hi rohith");
		//calling the methods by passing the respective parameters
		instagram();
		instagram(3);
		instagram("reels");
	}
	

}
