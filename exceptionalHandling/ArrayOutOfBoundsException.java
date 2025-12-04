package exceptionalHandling;

public class ArrayOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,30,40};
		System.out.println("Size of array: "+arr.length);
		try {
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Size of the array is lesser.");
		}
	}

}
