package OopsConcepts;
//Association:- Aggregation and Compostion
public class Employee {
	int id;
	String name;
	Address address;

	Employee(String name, int id, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void show() {
		System.out.println(name + " " + id);
		System.out.println(address.city + " " + address.state + " " + address.county);
	}

	public static void main(String[] args) {
		Address a = new Address("Raipur", "Chhattisgarh", "India");
		Address a1 = new Address("Bilaspur", "Chhattisgarh", "India");

		Employee s1 = new Employee("Ram", 9001, a);
		Employee s2 = new Employee("Aakash", 9003, a1);
		s1.show();
		s2.show();
	}
}
