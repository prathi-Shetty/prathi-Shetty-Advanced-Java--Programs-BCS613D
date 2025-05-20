/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as follows1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/
package listOperations;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        // Create an ArrayList and LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Add initial elements to both lists
        addElements(arrayList);
        addElements(linkedList);

        // Add an element at a specific index
        addElementAtIndex(arrayList, 1, "Mango");
        addElementAtIndex(linkedList, 1, "Mango");

        // Add multiple elements to the list
        addMultipleElements(arrayList, Arrays.asList("Pineapple", "Grapes"));
        addMultipleElements(linkedList, Arrays.asList("Pineapple", "Grapes"));

        // Access element by index
        accessElement(arrayList, 2);
        accessElement(linkedList, 2);

        // Update (replace) an element at a specific index
        updateElement(arrayList, 0, "Kiwi");
        updateElement(linkedList, 0, "Kiwi");

        // Remove a specific element
        removeElement(arrayList, "Banana");
        removeElement(linkedList, "Banana");

        // Search for an element in the list
        searchElement(arrayList, "Orange");
        searchElement(linkedList, "Orange");

        // Get the size of the list
        listSize(arrayList);
        listSize(linkedList);

        // Iterate through the list using for-each loop
        iterateList(arrayList);
        iterateList(linkedList);

        // Iterate through the list using Iterator
        useIterator(arrayList);
        useIterator(linkedList);

        // Sort the list in ascending order
        sortList(arrayList);
        sortList(linkedList);

        // Get a sublist from the list
        getSubList(arrayList, 1, 3);
        getSubList(linkedList, 1, 3);

        // Clear all elements from the list
        clearList(arrayList);
        clearList(linkedList);
    }

    // Method to add initial elements to the list
    static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Added elements: " + list);
    }

    // Method to add an element at a specific index
    static void addElementAtIndex(List<String> list, int index, String element) {
        list.add(index, element);
        System.out.println("After adding at index " + index + ": " + list);
    }

    // Method to add multiple elements to the list
    static void addMultipleElements(List<String> list, List<String> elements) {
        list.addAll(elements);
        System.out.println("After adding multiple elements: " + list);
    }

    // Method to access an element at a given index
    static void accessElement(List<String> list, int index) {
        System.out.println("Element at index " + index + ": " + list.get(index));
    }

    // Method to update an element at a specific index
    static void updateElement(List<String> list, int index, String newValue) {
        list.set(index, newValue);
        System.out.println("After updating element at index " + index + ": " + list);
    }

    // Method to remove a specific element
    static void removeElement(List<String> list, String value) {
        list.remove(value);
        System.out.println("After removing '" + value + "': " + list);
    }

    // Method to search for an element
    static void searchElement(List<String> list, String value) {
        boolean found = list.contains(value);
        System.out.println("Is '" + value + "' in list? " + found);
    }

    // Method to display the size of the list
    static void listSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    // Method to iterate using for-each loop
    static void iterateList(List<String> list) {
        System.out.print("Iterating: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Method to iterate using Iterator
    static void useIterator(List<String> list) {
        System.out.print("Using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    // Method to sort the list
    static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }

    // Method to extract a sublist
    static void getSubList(List<String> list, int fromIndex, int toIndex) {
        List<String> sub = list.subList(fromIndex, toIndex);
        System.out.println("Sublist (" + fromIndex + "-" + toIndex + "): " + sub);
    }

    // Method to clear all elements from the list
    static void clearList(List<String> list) {
        list.clear();
        System.out.println("List cleared. Current contents: " + list);
    }
}
