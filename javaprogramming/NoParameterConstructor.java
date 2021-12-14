package javaprogramming;

class Student
{
	public String name;
	public int id;
	public double marks;
	
	public Student()//no-arg constructor and intializing values in the constructor
	{
		name="Rohith";
		id=582;
		marks=75.43;
	}
}

public class NoParameterConstructor 
{
	public static void main(String[] args) 
	{
		Student obj=new Student();//creating object to access the constructor
		System.out.println("Name = "+obj.name);
		System.out.println("Id = "+obj.id);
		System.out.println("Marks = "+obj.marks);
		
	}


}
