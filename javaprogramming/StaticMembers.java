package javaprogramming;
 class Static_Members 
{
	public static int x=10;//static data member
	public static void print()//static data method
	{
		System.out.println("I am a Static Member");
	}
	
}
class NonStaticMembers
{
	double y=10.11;//non-static data member
	public void disp()//non-static data method
	{
		System.out.println("I am a Non-Static Member");
	}
}

public class StaticMembers
{
	public static void main(String[] args) 
	{
		NonStaticMembers non=new NonStaticMembers();//to access nonstatic members we create a object
		System.out.println("x= "+Static_Members.x);//to access static members we use classname
		System.out.println("y= "+non.y);
		Static_Members.print();
		non.disp();
		
	}
}
