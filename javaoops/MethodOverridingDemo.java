package javaoops;

class Plants
{
	//methodoverriding is changing the implemenation of superclass method in the subclass method
	//the method name and parameters should be same in both super class and sub class
	//methodoverriding has to be done in the subclass
	
	public void foodChain()
	{
		System.out.println("Plants take water");
	}
}
class Deer extends Plants
{
	//here foodchain method is overrided
	public void foodChain()
	{
		System.out.println("Deer eats Plants");
	}
}
class Lion extends Deer
{
	//here foodchain method is overrided
	public void foodChain()
	{
		System.out.println("Lion eats Deer");
	}
}
public class MethodOverridingDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("****Plants super class method****");
		Plants leaf=new Plants();
		leaf.foodChain();
		System.out.println("****foodchain method overrided in Deer subclass method****");
		Deer object=new Deer();
		object.foodChain();
		System.out.println("****foodchain method overrided in Lion subclass method****");
		Lion obj=new Lion();
		obj.foodChain();
		
	}

}
