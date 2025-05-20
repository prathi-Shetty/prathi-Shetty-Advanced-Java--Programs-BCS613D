/*Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()*/
package StringOpertaions;

public class SubstringOccuranceCounter {

    // Function to count non-overlapping occurrences of subString in mainString
    public static int countOccurrences(String mainString, String subString) {
        int count = 0;
        int index = 0;

        // Loop through the mainString to find all occurrences
        while ((index = mainString.toLowerCase().indexOf(subString.toLowerCase(), index)) != -1) {
            count++;
            index += subString.length(); // Move past the current match
        }

        return count;
    }

    public static void main(String[] args) {
        String mainString = "Hello world, hello everyone!";
        String subString = "hello";

        int occurrences = countOccurrences(mainString, subString);
        System.out.println("The substring '" + subString + "' appears " + occurrences + " times.");
    }
}
