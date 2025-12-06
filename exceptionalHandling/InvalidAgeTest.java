package exceptionalHandling;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class InvalidAgeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new InvalidAgeException("Candidate is not eligible to vote");
			}else {
				System.out.println("Candidate is eligible to vote");
			}
		}catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
	}

}
