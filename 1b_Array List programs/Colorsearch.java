/*1. Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not*/
package listOperations;

import java.util.*;

public class ColorSearch {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the list of colors
        System.out.println("Colors List: " + colors);

        // Search for the color "Red"
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }
    }
}
