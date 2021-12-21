package collectionsframework;
import java.util.*;
public class DemoArrayList3 
{
	public static void main(String[] args) 
	{
		//By using object class we can pass different data at same time
		ArrayList<Object> arrays=new ArrayList<Object>();
		arrays.add(1);
		arrays.add(2);
		arrays.add(3);
		arrays.add("Welcome");
		arrays.add("to");
		arrays.add("Streets");
		arrays.add(25);
		System.out.println(arrays);
		
		//new arraylist
		ArrayList<String> str=new ArrayList<String>();
		str.add("Hello");
		str.add("Goodmorning");
		System.out.println(str);
		arrays.addAll(str);
		System.out.println(arrays);
		

	}

}
