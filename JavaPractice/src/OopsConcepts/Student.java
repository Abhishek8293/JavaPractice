package OopsConcepts;

public class Student {

    private String name;
    int rollNumber;
    public Student() {
        name = "Abhishek";
        rollNumber  = 001;
    }
    public Student(String n, int num) {
        name = n;
        rollNumber = num;
    }
    public Student(String n) {
        name = n;
    }

    public void print() {
        System.out.println("Name = " + name + " " + "Roll Number = " + rollNumber);
    }

    public String getName() {    // getter() to get private value
        return name;
    }

    public void setName(String name) {   // setter() to set the value of private variable
		this.name = name; // here this keyword is used to refere the instance variable
	}
}
