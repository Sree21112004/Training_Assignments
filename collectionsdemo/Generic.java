package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<>();
		l1.add("Hi");
		l1.add("Hello");
		for(String val:l1) {
			System.out.println(val);
		}
	}

}
