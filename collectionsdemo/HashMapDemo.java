package collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can have null value unlike HashTable
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "Sree");
		m1.put(2, "Ram");
		m1.put(4, "Aksh");
		m1.put(null, null);
		System.out.println("Printing elements of HashMap: ");
		System.out.println(m1);
		m1.put(3,"Karan");
		System.out.println("Printing elements after adding in HashMap: ");
		for(Map.Entry<Integer, String> map: m1.entrySet()) {
			System.out.println("Key: "+map.getKey()+"\tValue: "+map.getValue());
		}
		System.out.println("Printing elements of HashMap in a format: ");
		for(Map.Entry<Integer, String> map: m1.entrySet()) {
			System.out.println("Key: "+map.getKey()+"\tValue: "+map.getValue());
		}
	}

}
