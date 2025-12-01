package collectionsdemo;
import java.util.HashSet;
public class HashSetDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Float> f1=new HashSet<>();
		f1.add(11.22f);
		f1.add(21.53f);
		System.out.println("Set elements:");
		for(float val:f1) {
			System.out.println(val);
		}
		f1.add(21.53f);
		System.out.println("Set after adding duplicate number:");
		for(float val:f1) {
			System.out.println(val);
		}
		f1.remove(21.53f);
		System.out.println("Set after deleting an element:");
		for(float val:f1) {
			System.out.println(val);
		}
	}

}
