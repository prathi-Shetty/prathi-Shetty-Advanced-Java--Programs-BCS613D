/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()*/
package StringOpertaions;

public class NumericChecker {

    // Checks if the string contains only digits (0-9)
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456789";

        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string contains non-numeric characters.");
        }
    }
}
