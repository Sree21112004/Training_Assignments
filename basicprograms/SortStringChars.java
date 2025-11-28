package basicprograms;
import java.util.*;
public class SortStringChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();

        char[] ch=str.toCharArray();
        Arrays.sort(ch);

        System.out.println("Sorted: " + new String(ch));
	}

}
