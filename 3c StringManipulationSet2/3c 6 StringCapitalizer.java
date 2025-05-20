/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()*/
package StringOpertaions;

public class StringCapitalizer {

    // Method to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                                 .append(word.substring(1).toLowerCase())
                                 .append(" ");
            }
        }

        return capitalizedString.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        String input = "hello world from java programming";
        String result = capitalizeWords(input);
        System.out.println("Capitalized Words: " + result);
    }
}
