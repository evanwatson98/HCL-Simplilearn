package practice.hcl.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
	
	private static List<String> getData(){
		List<String> a1 = new ArrayList<>();
		List<String> a2 = new LinkedList<>();

		int n = 97;
		
		while(n <= 122) {
			char c = (char) n;
			a1.add(String.valueOf(c));
			n++;
		}
		return a1;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(IntStream.range(1, 10)
		.skip(5)
		.sum()
		);
//		.forEach(x->System.out.println(x));
		
		Stream.of("Aarorn", "John", "Aibek")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		String[] names = {"Aibek", "Darion", "Saran", "Daniel", "Drake"};
		Arrays.stream(names)
		.filter(x->x.startsWith("D"))
		.sorted()
		.forEach(System.out::println);
		
		
		Integer[] nums = {2,5,7,4,6,7,10,21,34};
		Arrays.stream(nums)
		.filter(x->x%2 ==0)
		.sorted()
		.forEach(System.out::println);
		
		
		List<String> person = Arrays.asList("A", "B", "C", "D");
		person.stream().map(String::toLowerCase)
		.filter(x->x.startsWith("a"))
		.forEach(System.out::println);
		
//		List<String> rows = Files.lines(Paths.get("C:"));
//		rows.sorted()
//		.filter(x -> x.length() > 10)
//		.forEach(System.out::println);
		
//		Stream<String> rows2 =  Files.lines(Paths.get("C:"));
//		int rowCount = (int) rows2.map(x->x.split(","))
//				.filter(x -> { 
//					System.out.println(x);
//					return x[0].length() ==3;
//				})
//				.count();
//		System.out.println(rowCount + "rows ");
//		rows2.close();
		
		double total = Stream.of(7.3, 1.5, 4.8)
				.reduce(0.0,  (Double a, Double b) -> a+b);
		System.out.println("Total" + total);
		
		System.out.println("Normal");
		IntStream range = IntStream.range(1, 10);
		range.forEach(System.out::println);
		
		System.out.println("Parallel");
		IntStream range2 = IntStream.range(1, 10);
		range2.parallel().forEach(System.out::println);
		
		//Executor Service -> FixedThreadPool, ScheduledThreadPool
		
		//Thread -> as soon as it executes it will stop and you ca't reuse the same thread
		
		//Ex. 100 tasks
		//100 task -> 90
		//start(), run(), stop() -> Thread will be killed
		//ExecutorService
		//CyclicBarrier, CountDownLatch, Semaphore,...
		//Java6 -> synchronized can be applied either with the block or with the methods
		
		
		System.out.println("Normal Parallel Stream");
		List<String> alpha = getData();
		alpha.parallelStream().forEach(System.out::println);
		
		//Asynchrous -> Future: does not support NON-blocking feature
		//or CompleteableFuture: supports both Asynch as well as non-blocking
		//function1(30 mins), function2(10 mins) finction3(1 min)
		//Example transactions should be done on MultThreading
		//Calleable -> call() -> Future
		
	}
}
