package basicprograms;
import java.util.*;
public class ReplaceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();
        System.out.print("Enter target: ");
        String target=sc.nextLine();
        System.out.print("Enter replacement: ");
        String rep=sc.nextLine();
        
        System.out.println("Result: " + str.replace(target,rep));
	}

}
