package collectionsdemo;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<>();
		l1.add("Anbu");
		l1.add("Bala");
		l1.add("Raju");
		l1.add("Anbu");
		System.out.println("The objects in the list are: ");
		for(String val:l1){
			System.out.println(val);
		}
		l1.add(2,"Dhamu");
		System.out.println("The objects in the list after addition are: ");
		for(String val:l1){
			System.out.println(val);
		}
		l1.remove("Anbu");
		System.out.println("The objects in the list after deletion are: ");
		for(String val:l1){
			System.out.println(val);
		}
	}

}
