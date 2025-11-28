package basicprograms;
import java.util.*;
public class CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();
        System.out.print("Enter character: ");
        char ch=sc.next().charAt(0);

        int count=0;
        for(char c:str.toCharArray()) if(c==ch) count++;

        System.out.println("Frequency: " + count);
	}

}
