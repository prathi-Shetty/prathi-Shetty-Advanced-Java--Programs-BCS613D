/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()*/
package StringOpertaions;

public class WhiteSpaceRemover {

    // Method to remove all whitespace characters from the string
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", ""); // Removes spaces, tabs, newlines, etc.
    }

    public static void main(String[] args) {
        String input = "   Hello   World   !   ";

        String result = removeWhitespace(input);
        System.out.println("String without whitespace: '" + result + "'");
    }
}
