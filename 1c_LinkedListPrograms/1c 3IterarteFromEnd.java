/*3. Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))*/
package listOperations;

import java.util.*;

public class InsertAtEnd {
    public static void main(String args[]) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add initial elements
        colors.add("Red");
        colors.add("Blue");

        // Insert "Pink" at the end of the list using offerLast()
        colors.offerLast("Pink");

        // Display the updated list
        System.out.println("After inserting 'Pink' at the end: " + colors);
    }
}
