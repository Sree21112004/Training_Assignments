package basicprograms;
import java.util.*;
public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        System.out.print("Rotate by: ");
        int k=sc.nextInt();
        
        int[] rotated=new int[n];
        for(int i=0;i<n;i++) rotated[i]=arr[(i+k)%n];

        System.out.println("Rotated: " + Arrays.toString(rotated));
	}

}
