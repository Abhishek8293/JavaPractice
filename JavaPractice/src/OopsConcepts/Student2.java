package OopsConcepts;

public class Student2 {
	String name;
	int age;

	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

	Student2() {
		System.out.println("Constructor Called");
	}

	Student2(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name + this.age);
	}
}

class Constructor {
	public static void main(String[] args) {
		Student2 obj1 = new Student2("Abhishek", 001);
		obj1.printInfo();
	}
}