/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().*/
package StringOpertaions;

import java.util.*;

public class StringNullOrEmptyChecker {

    // Function to check if the string is null or contains only whitespace
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {

        // Sample input string (you can modify it to test different cases)
        String input = "   ";

        // Check and display whether the string is null or only whitespace
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is not null and contains non-whitespace characters.");
        }
    }
}
