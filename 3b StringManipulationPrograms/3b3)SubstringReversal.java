/* Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().*/
package StringOpertaions;

public class StringReversal {

    // Function to reverse the characters in a string using StringBuilder
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversedString = reverseString(input);

        System.out.println("Reversed String: " + reversedString);
    }
}
