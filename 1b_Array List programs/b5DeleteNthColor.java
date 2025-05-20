/*6. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index*/
package listOperations;

import java.util.*;

public class DeleteNthColor {
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

        // Input index to remove (nth element)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index (starting from 0) to remove: ");
        int index = scanner.nextInt();

        // Check and remove
        if (index >= 0 && index < colors.size()) {
            String removed = colors.remove(index);
            System.out.println("Removed color: " + removed);
        } else {
            System.out.println("Invalid index.");
        }

        // Display updated list
        System.out.println("Updated Colors List: " + colors);
    }
}
