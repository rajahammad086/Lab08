
// Author: Chris Fietkiewicz
// Starter code for Lab #8
//Raja Hammad Mehmood
// Modified the given code to add  Abstract lists and then print them out. 
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.AbstractList;

public class Lab8starter {
	public static void main(String[] args) {
		// Creating object of class linked list
		LinkedList<Integer> object = new LinkedList<Integer>();

		// Adding elements to the linked list
		object.add(5);
		object.add(6);
		object.add(7);
		System.out.println("LinkedList with Integers...");
		printList(object);
		System.out.println();
		// Create and print ArrayList with Strings
		LinkedList<String> object2 = new LinkedList<String>();

		// Adding elements to the linked list
		object2.add("What are");
		object2.add(" we");
		object2.add(" doing?");
		System.out.println("ArrayList with Strings...");
		printList(object2);
		System.out.println();
		// Copy and print ArrayList with Integers
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.addAll(0, object);
		System.out.println("Copied ArrayList with Integers...");
		printList(arraylist);
		System.out.println();
	}

	// Method that prints any AbstractList, including ArrayList and LinkedList
	public static void printList(AbstractList list) {
		Iterator iList = list.iterator();
		while (iList.hasNext())
			System.out.print(iList.next() + " ");
		System.out.println();
	}
}