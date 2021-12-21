package collectionsframework;
import java.util.*;
public class DemoArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("Array list Integers = "+ al);
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(50);
		l.add(60);
		l.add(70);
		al.addAll(l);
		
		System.out.println("List Integers = "+l);
		
		System.out.println("All Integrs = "+al);
	 	
		
	}

}
