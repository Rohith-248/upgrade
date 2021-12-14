package javaprogramming;

class Employee
{
	public String empname;
	public int empid;
	public double salary;
	
	//Parameterized constructor
	public Employee(String empname,int empid,double salary)
	{
		this.empname=empname;
		this.empid=empid;
		this.salary=salary;
	}
}



public class Parameter_Constructor
{
	public static void main(String[] args) 
	{
		//creating object and passing values to the object created to access the parameterized constructor
		Employee object=new Employee("Rohith",12345,20000.00);
		System.out.println("Employee Name = "+object.empname);
		System.out.println("Employee Id = "+object.empid);
		System.out.println("Employee Salary = "+object.salary);
		
	}

}
