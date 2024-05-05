package CollectionPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {
	
	public static void main(String[] args) {

		// create an Linked List using List interface
		List<String> list = new LinkedList<>();

		// Create an list using LInked List class
		LinkedList<String> linkedList = new LinkedList<>();
		
		
		//adding the element using default add() method that adds the element at the end of the list
		linkedList.add("apple");
		linkedList.add("banana");
		System.out.println(linkedList);
		
		//adding an element using addLast() method
		linkedList.addLast("cherry");
		System.out.println("added the element to the last : "+linkedList );
		
		//adding an element to the first of linked list
		linkedList.addFirst("Guava");
		System.out.println("added the element to the first : "+linkedList );
		
		//adding element at the specific index
		linkedList.add(2,"Mango");
		System.out.println("added the element at the index 2 : "+linkedList );
		
		//deleting an element at specific index
		linkedList.remove(0);
		System.out.println("deleted the element at the index 0 : "+linkedList );
		
		//checking if the linked list contains a specific element 
		System.out.println(linkedList.contains("Mango"));
		
		System.out.println(linkedList.element());
		
		for(String val:linkedList) {
			System.out.println( "Traversing :"+val);
		}
		System.out.println("-------------------------------------------------");
		
		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println("Using Iterator:- "+itr.next());
		}
		
		
		System.out.println("Size of the linked list:--- "+linkedList.size());
		

		
	}

}
