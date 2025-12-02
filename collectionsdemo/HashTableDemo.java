package collectionsdemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cannot have null values unlike HashMap
		Map<Integer, String> m1 = new Hashtable<>();
		m1.put(101, "Sree");
		m1.put(201, "Ram");
		m1.put(401, "Aksh");
		System.out.println("Printing elements of HashMap: ");
		System.out.println(m1);
		m1.put(301,"Karan");
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
