package regularExpression;
import java.util.Scanner;
public class PhoneNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String numPattern="(0|\\+91)?[6-9]\\d{9}";
		char check;
		do {
			System.out.println("Enter phone number:");
			String num=sc.nextLine();
			if(num.matches(numPattern)) {
				System.out.println("Valid number");
			}else {
				System.out.println("Invalid number");
			}
			System.out.println("Do you want to continue (y/n)");
			check = sc.next().charAt(0);
		}while(check!='n');
	}

}
