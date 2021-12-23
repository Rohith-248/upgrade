package hashmapcollections;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> mobile=new HashMap<String,Integer>();
		//we use put method to add elements into the hashmap
		mobile.put("Samsung", 1);
		mobile.put("Vivo", 10);
		mobile.put("Apple", 2);
		mobile.put("Sony", 8);
		mobile.put("Xiaomi", 3);
		mobile.put("Realme", 5);
		mobile.put("OnePlus", 4);
		mobile.put("Lenovo", 15);
		System.out.println("HashMap Elements = "+mobile);
		//get(Object Key) is used to get the value of that particular key
		System.out.println(mobile.get("Apple"));
		
		//size() method is used to display the number of elements in the hashmap
		System.out.println(mobile.size());
		
		//containsKey() method returns true if the key present in the hashmap or else false
		System.out.println(mobile.containsKey("Vivo"));
		
		//containsValue() method returns true if the Value present in the hashmap or else false
		System.out.println(mobile.containsValue(4));//true
		System.out.println(mobile.containsValue(21));//false
		
		//remove(Key,value) removes specified element and returns true if removed
		System.out.println(mobile.remove("Realme", 5));//true
		System.out.println(mobile.remove("Lg", 21));//false key,value not present in hashmap
		
		//remove(Key) removes element and returns  value associated to that key
		System.out.println(mobile.remove("Sony"));
		
		//replace() which replaces the value of that key
		System.out.println(mobile.replace("Apple", 2, 7));
		

		System.out.println(mobile);
	}

}
