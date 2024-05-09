package java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		// A stream is a sequence of elements that supports various operations to
		// perform computations on its elements.
		numbers.stream()// This line converts the list numbers into a stream.
				.filter(x -> x % 2 == 0) // This line applies a filter operation to the stream using a lambda
											// expression.
				.forEach(System.out::println); // "println" is passed as a method reference
		
		
		Integer firstEven = numbers.stream()
                .filter(x -> x % 2 == 0)
                .findFirst()
                .orElse(0); 
        System.out.println("First even number: " + firstEven);
        
        long count = numbers.stream()
                .count();
        System.out.println("Total numbers: " + count);
	}

}

/*
 * The Stream API in Java 8 provides a rich set of methods for processing data
 * collections in a declarative and functional manner. Here's a breakdown of the
 * key methods categorized based on their functionality:
 * 
 * -----------1.Stream Creation:-------------
 * 
 * > Stream.of(varargs arguments):- Creates a stream from a variable number of arguments. 
 * > Stream.empty():- Returns an empty stream. 
 * > Arrays.stream(array):- Creates a stream from an array. 
 * > Collection.stream():- Creates a stream from a collection object.
 * > IntStream.range(start, endExclusive):- Creates a stream of integers from a start (inclusive) to an end (exclusive) value.
 * > IntStream.rangeClosed(start, endInclusive):- Creates a stream of integers from a start (inclusive) to an end (inclusive) value.
 * > LongStream.range(start,endExclusive):- Creates a stream of longs from a start (inclusive) to an end (exclusive) value.
 * > LongStream.rangeClosed(start, endInclusive):- Creates a stream of longs from a start (inclusive) to an end (inclusive) value.
 * > Stream.builder(): Provides a builder pattern for creating complex streams.
 * 
 * -------------2. Intermediate Operations:----------------
 * 
 * These operations transform the elements of a stream without necessarily
 * producing a final result. They return a new stream allowing for chaining of
 * operations.
 * 
 * > filter(Predicate predicate):- Filters elements based on a provided predicate (a condition).
 * > map(Function mapper):- Applies a mapping function to each element, transforming the stream to a new stream of another type.
 * > flatMap(Function mapper):- Similar to map, but applies a function that returns a stream for each element, effectively flattening the resulting streams into a single stream. 
 * > distinct():- Removes duplicate elements from the stream.
 * > sorted():- Sorts the elements in the stream according to a natural ordering or a custom comparator. 
 * > peek(Consumer consumer):- Performs a side effect on each element in the stream (e.g., printing or logging) without changing the stream itself. 
 * > limit(long maxSize):- Limits the number of elements in the stream.
 * > skip(long n):- Skips the first n elements in the stream.
 * 
 * 
 * ----------------3. Terminal Operations:-----------------
 * 
 * These operations consume the entire stream and produce a result or perform a
 * side effect. They typically don't return a stream, but the final result or
 * trigger the side effect.
 * 
 * > forEach(Consumer consumer):- Performs an action for each element in the stream. 
 * > forEachOrdered(Consumer consumer):- Similar to forEach, but ensures elements are processed in encounter order.
 * > toArray(Supplier<? extends T[]> supplier):- Collects the elements of the stream into an array.
 * > collect(Collector collector):- Collects the elements of the stream into a container using a specified collector. Collectors allow for various aggregations and transformations.
 * > min(Comparator comparator):- Finds the minimum element according to a natural ordering or a custom comparator.
 * > max(Comparator comparator):- Finds the maximum element according to a natural ordering or a custom comparator.
 * > count():- Returns the count of elements in the stream.
 * > anyMatch(Predicate predicate):- Returns true if any element in the stream matches the provided predicate.
 * > allMatch(Predicate predicate):- Returns true if all elements in the stream match the provided predicate.
 * > noneMatch(Predicate predicate):- Returns true if no elements in the stream match the provided predicate. 
 * > findFirst():- Returns an optional containing the first element of the stream, or empty if the stream is empty.
 * > findAny():- In a parallel stream, returns an optional containing any element of the stream.
 * 
 * 
 * ----------------4. Short-circuiting Operations:-----------------
 * 
 * Some intermediate operations (like limit, findFirst, findAny, anyMatch,
 * allMatch, noneMatch) are short-circuiting. This means that the processing
 * stops as soon as the result can be determined, potentially iterating only
 * over a subset of the stream elements and improving performance.
 * 
 * By effectively combining these methods, you can achieve powerful and concise
 * data processing pipelines in your Java applications.
 * 
 */
