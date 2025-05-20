/* Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)*/
package listOperations;
import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original Colors List: " + colors);

        // Sort the list using Collections.sort()
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted Colors List: " + colors);
    }
}
