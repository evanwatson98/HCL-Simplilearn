package practice.hcl.lambdas;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaFourMainCategories {
 
	public static void main(String[] args) {
		//Predicate: obj -> boolean
		System.out.println("Predicate");
		System.out.println("--------------------------");
		Predicate<Integer> pred1 = i -> (i > 50);
		boolean result = pred1.test(451);
		System.out.println("result: " + result);
		System.out.println();
		
		System.out.println("Predicate AND");
		System.out.println("--------------------------");
		Predicate<Integer> p1 = i -> i > 5;
		Predicate<Integer> p2 = i -> i < 20;
		Predicate<Integer> p3 = p1.and(p2);
		System.out.println("testing the AND operator: " + p3.test(4));
		System.out.println("testing the AND operator: " + p3.test(16));
		System.out.println();
		
		//Supplier: (-> obj	}, only has a get() method that return an object
		System.out.println("Supplier");
		System.out.println("--------------------------");
		Supplier<String> s1 = () -> {
			return "testing out supplier";
		};
		String supplierResult = s1.get();
		System.out.println(supplierResult);
		System.out.println();
		
				
		//Consumer: T -> void
		System.out.println("Consumer");
		System.out.println("--------------------------");
		Consumer<String> con1 = s -> System.out.println("This is the consumer output " + s);
		Consumer<Double> con2 = System.out::println;
		
		con1.accept("woo hoo!");
		con2.accept(8.2);
		System.out.println();
		
		
		//Function: obj -> obj
		System.out.println("Function");
		System.out.println("--------------------------");
		Function<String, Integer> fun1 = s -> s.length();
		System.out.println("The function output: " + fun1.apply("Yes"));
		System.out.println();
		
		
		//BioConsumer
		System.out.println("BiConsumer");
		System.out.println("--------------------------");
		BiConsumer<String, Integer> biConsumer1 = (s,i) -> System.out.println("Input 1: " + s + " Input 2: " + i);
		biConsumer1.accept("Fred", 77);
		System.out.println();
		
		
		//BioConsumer
		System.out.println("IntSupplier");
		System.out.println("--------------------------");
		IntSupplier intSupplier = () -> {return 56;};
		System.out.println("int supplied was this: " + intSupplier.getAsInt());
		System.out.println();
		
		ArrayList<String> strList2 = new ArrayList<>();
		strList2.add("Clover");
		strList2.add("Evan");
		strList2.add("Kevin");
		strList2.add("Mevin");
		strList2.forEach(i -> System.out.println("item " + i));
		
	}
}
