package practice.hcl.lambdas;

// A Functional interface only has 1 abstract method: @FunctionalInterface
public interface Bounceable<T> {
	
	public boolean test(T onj); //Abstract method
	
	public default void bounceThis() {
		
	};
}
