package basicprograms;
import java.util.*;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str=sc.nextLine();
        System.out.println("Word count: " + str.trim().split("\\s+").length);
	}

}
