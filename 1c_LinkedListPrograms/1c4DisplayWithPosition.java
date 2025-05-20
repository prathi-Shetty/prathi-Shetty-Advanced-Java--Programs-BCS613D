/*4. Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )*/
package listOperations;

import java.util.*;

public class DisplayWithPositions {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add elements to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Display elements along with their positions (indices)
        System.out.println("Elements with their positions:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
