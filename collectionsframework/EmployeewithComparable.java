package collectionsframework;
import java.util.*;
public class EmployeewithComparable
{
	public static void main(String[] args) 
	{
		ArrayList<DemoEmployee> demo=new ArrayList<DemoEmployee>();
		demo.add(new DemoEmployee("Rohith",1,"Bangalore"));
		demo.add(new DemoEmployee("Meliodas",9,"Chennai"));
		demo.add(new DemoEmployee("Zero",3,"Kolkatta"));
		demo.add(new DemoEmployee("Naruto",7,"Pune"));
		demo.add(new DemoEmployee("Gintama",6,"Bangalore"));
		Collections.sort(demo);
		//System.out.println(demo);
		for(DemoEmployee emp:demo)
		{
			System.out.println(emp);
		}
		
		
	}

}
