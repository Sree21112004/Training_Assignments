package collectionsdemo;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> f1=new TreeSet<>();
		f1.add(162);
		f1.add(11);
		f1.add(29);
		System.out.println("Set elements:");
		for(float val:f1) {
			System.out.println(val);
		}
		f1.add(21);
		System.out.println("Set after adding number:");
		for(float val:f1) {
			System.out.println(val);
		}
		f1.remove(21);
		System.out.println("Set after deleting an element:");
		for(float val:f1) {
			System.out.println(val);
		}
	}

}
