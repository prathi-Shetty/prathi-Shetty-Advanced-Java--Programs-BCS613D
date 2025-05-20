/*Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()*/
package StringOpertaions;

public class WordCounter {

    // Method to count words in a string
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Splits the string by one or more whitespace characters
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "This is a simple string with multiple words";

        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }
}
