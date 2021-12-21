package collectionsframework;
import java.util.*;
public class SwapArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> swaparr=new ArrayList<Integer>();
		swaparr.add(4);
		swaparr.add(3);
		swaparr.add(24);
		swaparr.add(144);
		swaparr.add(23);
		swaparr.add(2);
		swaparr.add(9);
		swaparr.add(55);
		swaparr.add(79);
		swaparr.add(6);
		swaparr.add(8);
		Collections.sort(swaparr);
		System.out.println(swaparr);
		System.out.println("ArrayList before Swapping");
		for(Integer num:swaparr)
		{
			System.out.println(num);
		}
		System.out.println("ArrayList After Swapping");
		Collections.swap(swaparr, 5, 8);
		for(Integer num:swaparr)
		{
			System.out.println(num);
		}
	}

}
