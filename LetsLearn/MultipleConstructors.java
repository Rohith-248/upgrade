package LetsLearn;

class Employee
{
	private int variable;
	

public Employee()
{
	this.variable=10;
	
}
public Employee(int num)
{
	this.variable=num;
}
public int getValue()
{
	return variable;
}
}
public class MultipleConstructors 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		Employee E=new Employee(100);
		System.out.println(e.getValue());
		System.out.println(E.getValue());
		
	}
	

}
