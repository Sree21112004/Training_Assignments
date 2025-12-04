package regularExpression;
import java.util.Scanner;
public class EmailPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emailPattern = "^[a-z][a-z0-9\\.\\-_]+@[a-z]+\\.[a-z]{2,7}$";
		char check;
		do {
			System.out.println("Enter the email id");
			Scanner sc = new Scanner(System.in);
			String email=sc.nextLine();
			if(email.matches(emailPattern))
				System.out.println("Valid email");
			else
				System.out.println("Invaid email");
			System.out.println("Do you want to continue (y/n)");
			check = sc.next().charAt(0);
		}while(check!='n');
	}

}
