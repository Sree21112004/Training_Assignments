package basicprograms;
import java.util.*;
public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("String 1: ");
        String s1=sc.nextLine();
        System.out.print("String 2: ");
        String s2=sc.nextLine();

        System.out.println("equals(): " + s1.equals(s2));
        System.out.println("compareTo(): " + s1.compareTo(s2));
	}

}
