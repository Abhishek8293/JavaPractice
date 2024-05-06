package java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);
		//A stream is a sequence of elements that supports various operations to perform computations on its elements.
		numbers.stream()//This line converts the list numbers into a stream. 
				.filter(x -> x%2==0) //This line applies a filter operation to the stream using a lambda expression.
				.forEach(System.out::println); //"println" is passed as a method reference 
	}

}
