package exceptionalHandling;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr= {2,3,4,5};
		try {
			System.out.println(intArr[4]);
		}catch(ArrayIndexOutOfBoundsException aiob){
			System.out.println("Out of boundary of array");
		}finally {
			System.out.println("All resources are closed.");
		}
	}

}
