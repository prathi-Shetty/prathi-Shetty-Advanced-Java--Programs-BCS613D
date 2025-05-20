/*6. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index*/
package listOperations;

import java.util.*;

public class DeleteNthColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original Colors List: " + colors);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index (starting from 0) to remove: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < colors.size()) {
            String removed = colors.remove(index);
            System.out.println("Removed color: " + removed);
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("Updated Colors List: " + colors);
    }
}
