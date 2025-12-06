package streamsprgms;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3,6,9,1,34,5,7,12);
		
		//filter() to filter elements
		System.out.println("filter()");
		list.stream()
		.filter(x -> x%2==0)
		.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		//map() to transform a number into another number
		System.out.println();
		System.out.println("map()");
		list.stream()
		.map(num -> (num*num)+" is the square of "+num)
		.forEach(num->System.out.println(num));
		
		//reduce() to reduce into single number
		System.out.println();
		System.out.println("reduce()");
		int sumOfNums = list.stream()
		.reduce(0, (n1,n2) ->n1+n2);
		System.out.println(sumOfNums);
		
		//sorted() to sort the given array
		System.out.println();
		System.out.println("sort()");
		list.stream()
		.sorted()
		.forEach(x -> System.out.print(x+" "));
}

}
