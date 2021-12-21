package collectionsframework;

import java.util.ArrayList;

public class DemoArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.addAll(al);
		System.out.println(arr);
		
		
	}

}
