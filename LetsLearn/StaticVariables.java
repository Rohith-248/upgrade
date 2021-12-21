package LetsLearn;

public class StaticVariables 
{
	static int var;
	String name;
	public static void main(String[] args)
	{
		var=10;
		StaticVariables sv=new StaticVariables();
		sv.name="rohith";
		System.out.println(var);
		System.out.println(sv.name);
		
	}

}
