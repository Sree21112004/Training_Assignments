package exceptionalHandling;
import java.util.Scanner;
public class InvalidAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age: ");
		int age=sc.nextInt();
		try {
			if(age>=18) {
				System.out.println("Candiadate is eligible to vote");
			}
		}catch(ArithmeticException ae) {
			System.out.println("Candidate is not eligible to vote");
		}
		
	}

}
