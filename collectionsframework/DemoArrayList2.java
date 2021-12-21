package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList2 
{
	public static void main(String[] args) 
	{
		//arraylist sorting
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(10);
		array.add(3);
		array.add(21);
		array.add(19);
		array.add(90);
		array.add(45);
		
		//unsorted arraylist
		System.out.println("Arrays before sorting");
		for(Integer numbers:array)
		{
			System.out.println(numbers);
		}
		
		//sorted arraylist of ascending order
		System.out.println("Arrays after sorting------Ascending Order");
		Collections.sort(array);
		for(Integer numbers:array)
		{
			System.out.println(numbers);
		}
		
		//sorted arraylist of descending order
		System.out.println("Arrays after sorting------Descending Order");
		Collections.sort(array,Collections.reverseOrder());
		for(Integer numbers:array)
		{
			System.out.println(numbers);
		}
		
	}

}
