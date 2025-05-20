/*4 Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package listOperations;

import java.util.*;

public class ExtractColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original Colors List: " + colors);

        List<String> subList = colors.subList(0, 2);

        System.out.println("Extracted Elements (1st and 2nd): " + subList);
    }
}
