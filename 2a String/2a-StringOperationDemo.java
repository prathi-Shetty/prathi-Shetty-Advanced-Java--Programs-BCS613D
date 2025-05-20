/*2 a. Develop a java program for performing various string operations with different string handling functions directed as follows String Creation and Basic Operations, Length and Character Access, String Comparison,
String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and 
endsWith()*/
package StringOpertaions;

import java.util.*;

public class StringOperationsDemo {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());               // Length of str1
        System.out.println("Character at index 1 in str1: " + str1.charAt(1)); // Character at index 1 ('e')

        // 3. String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));        // Check equality
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));  // Lexicographic comparison

        // 4. String Searching
        String sample = "Welcome to Java programming";
        System.out.println("Contains 'Java'? " + sample.contains("Java"));   // Check substring presence
        System.out.println("Index of 'Java': " + sample.indexOf("Java"));    // Find substring index

        // 5. Substring Operations
        System.out.println("Substring from index 11: " + sample.substring(11));     // From index 11 to end
        System.out.println("Substring (11, 15): " + sample.substring(11, 15));     // Between indices 11 and 15

        // 6. String Modification
        System.out.println("Replace 'Java' with 'Python': " + sample.replace("Java", "Python")); // Replace substring
        System.out.println("To upper case: " + sample.toUpperCase());              // Convert to uppercase
        System.out.println("To lower case: " + sample.toLowerCase());              // Convert to lowercase

        // 7. Whitespace Handling
        String withSpaces = "   Trim me please   ";
        System.out.println("Before trim: '" + withSpaces + "'");                   // Before trimming spaces
        System.out.println("After trim: '" + withSpaces.trim() + "'");             // After trimming spaces

        // 8. String Concatenation
        String full = str1.concat(" ").concat(str2);                               // Concatenate with space
        System.out.println("Concatenated string: " + full);

        // 9. String Splitting
        String csv = "Red,Blue,Green,Yellow";
        String[] colors = csv.split(",");                                          // Split by comma
        System.out.println("Split result: " + Arrays.toString(colors));

        // 10. StringBuilder Demo (mutable string operations)
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");               // Append string at the end
        sb.insert(5, "Language ");                // Insert string at index 5
        sb.replace(5, 13, "Platform ");           // Replace substring from index 5 to 13
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        System.out.println(String.format("Name: %s | Age: %d", name, age));        // Format string with placeholders

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "student@example.com";
        boolean isValid = email.contains("@") && email.contains(".") &&
                          email.startsWith("student") && email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println("Is valid email? " + isValid);
    }
}
