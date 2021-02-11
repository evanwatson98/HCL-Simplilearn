package practice.hcl.lambdas;

import java.util.function.Predicate;

public class FunctionalInterfaceClient {
	//4 categories: predicates, suppliers, consumers, or functions
	public static void main(String[] args) {
		Bounceable<String> b1 = new Ball();
		System.out.println(b1.test("Fred"));
		
		
		//Inner Anonymous class
		Bounceable<String> b2 = new Bounceable<String>() {

			@Override
			public boolean test(String obj) {
				// TODO Auto-generated method stub
				return obj.length() > 1;
			}
		};
		System.out.println("Anonymous inner class: " + b2.test("Ian"));
		
		
		Predicate<String> p1 = s -> s.length() > 4;
		System.out.println("Predicate version: " + p1.test("Kevin"));
		
		
		//Same thing as the above Preddicate, just uses multiline for function section
		Bounceable<String> p2 = s -> {
			System.out.println(s);
			return s.length() > 4;
		};
		System.out.println(p2.test("Stacy"));
	}
}
