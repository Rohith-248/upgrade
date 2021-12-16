package javaoops;
//superclass
class Exam
{
	public int marks=100;
	public void results()
	{
		System.out.println("Marks are = "+marks);
	}
}

//subclass
class Test extends Exam
{
	
	public  void writeTest()
	{
		//super keyword is used to access the properties of super class from sub class
		String subject="english";
		System.out.println(subject);
		//accessing marks of superclass(Exam) From subclass(Test) by using super keyword
		System.out.println(super.marks);
		//accessing results method of superclass(Exam) from subclass(test) by using super keyword
		super.results();
	}
}
public class SuperKeyword 
{
	public static void main(String[] args) 
	{
		//creating object for the subclass
		Test obj=new Test();
		obj.writeTest();
		
	}

}
