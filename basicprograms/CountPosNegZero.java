package basicprograms;
import java.util.*;
public class CountPosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int pos=0, neg=0, zero=0;
        for(int x:arr){
            if(x>0) pos++;
            else if(x<0) neg++;
            else zero++;
        }
        System.out.println("Positive: "+pos+", Negative: "+neg+", Zero: "+zero);
	}

}
