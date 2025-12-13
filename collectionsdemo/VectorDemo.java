package collectionsdemo;
import java.util.Vector;

public class VectorDemo{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.addElement("Orange"); 

        String firstElement = vector.firstElement();
        String elementAtIndex1 = vector.get(1);

        for (String element : vector) {
            System.out.println(element);
        }

        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity()); // Default capacity is often 10, but grows dynamically
    }
}
