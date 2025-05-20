/*4 Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package listOperations;

import java.util.*;

public class ExtractColors {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original Colors List: " + colors);

        // Extract 1st and 2nd elements using subList (index 0 to 2, exclusive)
        List<String> subList = colors.subList(0, 2);

        // Display extracted elements
        System.out.println("Extracted Elements (1st and 2nd): " + subList);
    }
}

