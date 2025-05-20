/*2. Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())*/
package listOperations;

import java.util.*;

public class ReverseIterate {

    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add elements to the LinkedList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Display message for reverse iteration
        System.out.println("Iterating in reverse order:");

        // Create a descending iterator to iterate from the end
        Iterator<String> reverseIterator = colors.descendingIterator();

        // Use the iterator to print elements in reverse order
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
