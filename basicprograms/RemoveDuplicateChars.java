package basicprograms;
import java.util.*;
public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();

        for(char c:str.toCharArray()) if(set.add(c)) sb.append(c);

        System.out.println("Without duplicates: " + sb);
	}

}
