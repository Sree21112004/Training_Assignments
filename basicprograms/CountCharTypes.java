package basicprograms;
import java.util.*;
public class CountCharTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();

        int alpha=0, digit=0, special=0;
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)) alpha++;
            else if(Character.isDigit(c)) digit++;
            else special++;
        }
        System.out.println("Alphabets: "+alpha+", Digits: "+digit+", Special: "+special);
	}

}
