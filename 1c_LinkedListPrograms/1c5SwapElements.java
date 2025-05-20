/*5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))*/
package listOperations;

import java.util.*;

public class SwapElements {

    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add elements to the list with their respective indices
        colors.add("Red");     // index 0
        colors.add("Blue");    // index 1
        colors.add("Green");   // index 2

        // Display the list before swapping
        System.out.println("Before swap: " + colors);

        // Swap elements at index 0 and index 2
        Collections.swap(colors, 0, 2);

        // Display the list after swapping
        System.out.println("After swap: " + colors);
    }

}
