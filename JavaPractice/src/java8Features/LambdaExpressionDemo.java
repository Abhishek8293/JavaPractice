package java8Features;

@FunctionalInterface
interface DemoInterfaceForLambda {

	int operate(int x, int y);

}

class LambdaExpressionDemo {

	public static void main(String[] args) {
		DemoInterfaceForLambda add = (x, y) -> x + y; // Performed add operation using lambda expression.
		DemoInterfaceForLambda multi = (x, y) -> x * y; // Performed multiplication operation using same interface.

		System.out.println(add.operate(5, 7));
		System.out.println(multi.operate(6, 9));
	}

}
