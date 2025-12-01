package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class NonGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList<>();
		l1.add(10);
		l1.add("hello");
		System.out.println(l1);
		String s1=(String)l1.get(1);
		System.out.println(s1);
	}

}
