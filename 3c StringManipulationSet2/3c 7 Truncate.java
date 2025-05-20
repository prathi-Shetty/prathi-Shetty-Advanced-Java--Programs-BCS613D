/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()*/
package StringOpertaions;

public class StringTruncator {

    // Method to truncate a string to the given length and append "..." if needed
    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        } else {
            return str.substring(0, length) + "...";
        }
    }

    public static void main(String[] args) {
        String input = "Java programming is amazing!";
        int maxLength = 15;

        String truncatedString = truncate(input, maxLength);
        System.out.println("Truncated String: " + truncatedString);
    }
}
