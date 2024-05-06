package java8Features;

public class FunctionalInterfaceExample implements DemoInterface {

	@Override
	public void printString(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {

		DemoInterface obj = new FunctionalInterfaceExample();

		obj.printString("Hello World");

	}

}
