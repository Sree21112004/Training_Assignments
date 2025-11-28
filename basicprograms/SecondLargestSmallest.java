package basicprograms;
import java.util.*;
public class SecondLargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        Arrays.sort(arr);
        System.out.println("2nd Smallest: " + arr[1]);
        System.out.println("2nd Largest: " + arr[n-2]);
	}

}
