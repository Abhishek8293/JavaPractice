package serialiizationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		Person deserializedPerson;
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try {
			fileInputStream = new FileInputStream("D:\\person.data");
			objectInputStream = new ObjectInputStream(fileInputStream);
			deserializedPerson = (Person) objectInputStream.readObject();
			System.out.println(deserializedPerson.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close streams explicitly in a finally block
			if (objectInputStream != null) {
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace(); // handle potential close exception
				}
			}
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace(); // handle potential close exception
				}
			}
		}
	}

}

/*
 * If your Person class doesn't explicitly define "serialVersionUID", Java
 * generates one based on the class structure at that time. Any changes to the
 * class structure (adding/removing fields, methods, etc.) will generate a
 * different "serialVersionUID".
 */
