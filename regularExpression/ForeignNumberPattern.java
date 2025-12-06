package regularExpression;
import java.util.Scanner;
public class ForeignNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone number: ");
		String num=sc.nextLine();
		String usaPattern="(\\+1|1)?\\d{10}";
		if(num.matches(usaPattern)) {
			System.out.println("Valid USA number");
		}else {
		System.out.println("Invalid USA number");	
		}
	}

}
