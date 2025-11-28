package basicprograms;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        Set<Integer> set = new LinkedHashSet<>();
        for(int x:arr) set.add(x);

        System.out.println("Array without duplicates: " + set);
	}

}
