package CollectionPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapOperations {
	public static void main(String[] args) {

        // Create a HashMap of Integer key and value String
        HashMap<Integer, String> fruitMap = new HashMap<>();

        // Add fruits to the HashMap (key: ID, value: fruit name)
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Banana");
        fruitMap.put(3, "Orange");
        fruitMap.put(4, "Mango"); // Duplicate key will be overwritten

        System.out.println("Fruits (HashMap): " + fruitMap);

        // Get the size of the HashMap
        System.out.println("Size of HashMap: " + fruitMap.size());

        // Check if a fruit exists 
        System.out.println("Contains 'Mango'? " + fruitMap.containsValue("Mango"));

        // Get the value for a specific key
        String fruit2 = fruitMap.get(2);
        System.out.println("Fruit with ID 2: " + fruit2);

        // Remove a key-value pair
        fruitMap.remove(1);
        System.out.println("Fruits after removal: " + fruitMap);

        // Iterate through the HashMap (key-value pairs) using enhanced for-loop
        for (Entry<Integer, String> entry : fruitMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Fruit: " + entry.getValue());
        }

        // Iterate through the key set using iterator
        Set<Integer> keySet = fruitMap.keySet();
        Iterator<Integer> keyIterator = keySet.iterator();
        System.out.println("-------------Iterating keys using iterator---------");
        while (keyIterator.hasNext()) {
            int id = keyIterator.next();
            String fruit = fruitMap.get(id);  // Retrieve value using key
            System.out.println("ID: " + id + ", Fruit: " + fruit);
        }
    }

}
