package basicprograms;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();
        System.out.println("Reverse: " + new StringBuilder(str).reverse());
	}

}
