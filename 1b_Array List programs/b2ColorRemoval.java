/*2. Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList*/
package listOperations;

import java.util.*;

public class ColorRemoval {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");   // index 1 (2nd element)
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original Colors List: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedElement = colors.remove(1);
            System.out.println("Removed 2nd element: " + removedElement);
        }

        // Remove the color "Blue" by value
        boolean removedBlue = colors.remove("Blue");
        if (removedBlue) {
            System.out.println("Removed color: Blue");
        } else {
            System.out.println("Color 'Blue' not found in the list.");
        }

        // Display the updated list
        System.out.println("Updated Colors List: " + colors);
    }
}

