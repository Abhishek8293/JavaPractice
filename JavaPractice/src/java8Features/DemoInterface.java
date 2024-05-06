package java8Features;

@FunctionalInterface // Functional Interface is a interface that have single abstract method.

public interface DemoInterface {

	public void printString(String string);

	// If we try to write another abstract method in this interface it will show
	// error

	default void Random() {
		System.out.println("Default method");
	}
	// in @FunctionalInterface we can have multiple default method

}
