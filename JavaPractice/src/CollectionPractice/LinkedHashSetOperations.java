package CollectionPractice;

import java.util.LinkedHashSet;

public class LinkedHashSetOperations {
	
	 public static void main(String[] args) {

	        // Create a LinkedHashSet of Strings
	        LinkedHashSet<String> countries = new LinkedHashSet<>();

	        // Add elements to the LinkedHashSet
	        countries.add("India");
	        countries.add("USA");
	        countries.add("China");
	        countries.add("China");
	        countries.add("Australia");

	        System.out.println("Countries : " + countries);
	        System.err.println("-------Not allowing uplicates----------");

	        // Get the size of the LinkedHashSet
	        System.out.println("Size of LinkedHashSet: " + countries.size());

	        // Remove an element by value
	        countries.remove("China");
	        System.out.println("Countries after removal attempt: " + countries);

	        // Check if the set is empty
	        System.out.println("Is LinkedHashSet empty? " + countries.isEmpty());
	        
	        for(String s: countries) {
	        	System.out.println("-> "+s);
	        }

	        // Clear all elements from the LinkedHashSet
	        countries.clear();
	        System.out.println("Countries after clear: " + countries);

	        // Check if the set is empty again after clearing
	        System.out.println(countries.isEmpty());
	        
	        
	    }

}
