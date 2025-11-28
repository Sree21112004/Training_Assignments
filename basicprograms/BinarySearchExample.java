package basicprograms;
import java.util.*;
public class BinarySearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter sorted elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        System.out.print("Search key: ");
        int key=sc.nextInt();

        int low=0, high=n-1, index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key) { index=mid; break; }
            else if(arr[mid]<key) low=mid+1;
            else high=mid-1;
        }
        System.out.println(index==-1?"Not Found":"Found at index "+index);
	}

}
