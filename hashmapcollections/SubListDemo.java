package hashmapcollections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class SubListDemo {

	public static void main(String[] args)
	{
		LinkedList<Integer> call=new LinkedList<Integer>();
		call.add(21);
		call.add(88);
		call.add(211);
		call.add(3);
		call.add(45);
		call.add(66);
		call.add(90);
		call.add(72);
		call.add(9);
		call.add(7);
		call.add(10);
		call.add(59);
		call.add(62);
		System.out.println(call);
		
		Iterator<Integer> dial=call.iterator();
		while(dial.hasNext())
		{
			System.out.println(dial.next());
		}
		
		List<Integer> bycall=call.subList(2, 13);
		System.out.println("sublist = "+bycall);
		
		
	}

}
