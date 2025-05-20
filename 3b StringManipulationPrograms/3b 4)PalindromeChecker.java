/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():*/
package StringOpertaions;

public class PalindromeChecker {

    // Method to check if the input string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama"; // Example palindrome

        if (isPalindrome(input)) {
            System.out.println("✅ The string is a palindrome.");
        } else {
            System.out.println("❌ The string is not a palindrome.");
        }
    }
}
