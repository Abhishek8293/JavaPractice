package OopsConcepts;

public class Student1 {
	final int rollNumber;
	String name;
	double cgpa;
	public final static double CONVERSIONFACTOR = 0.9;
	// a final static variable same as constant in other language and it is better
	// to write variable name in capital letter

	static int studentCount;
	// static keyword make the variable or methods and class member not an object
	// member that mean all tha object of class can share the same value of static
	// variable

	Student1(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		System.out.println("Name :" + this.name + "\n" + "Roll Number :" + this.rollNumber);
		Student1.studentCount++;
		System.out.println("Number of Students :" + Student1.studentCount);
	}

	public static void main(String[] args) {
//        System.out.println(Student1.studentCount);
		Student1 s1 = new Student1("Abhishek", 001);

		s1.name = "Deepak";
		System.out.println("Name :" + s1.name);
		// s1.rollNumber = 002; this will show an error: cannot assign a value to final
		// variable rollNumber
		System.out.println("Roll Number :" + s1.rollNumber);

		Student1 s2 = new Student1("Ram", 003);
		Student1 s3 = new Student1("Chaman", 007);
	}
}
