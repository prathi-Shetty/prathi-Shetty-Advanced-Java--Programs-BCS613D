/*3a. Develop a java program for performing various string operations with different string handling functions directed as follows: String Creation and Basic Operations, Length and Character Access, String Comparison,
String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and 
endsWith()*/
package StringOpertaions;

import java.util.*;

public class StringOperationsDemo {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java Programming";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String sample = "Welcome to Java Programming";
        System.out.println("Contains 'Java'? " + sample.contains("Java"));
        System.out.println("Index of 'Java': " + sample.indexOf("Java"));
        System.out.println("Last index of 'o': " + sample.lastIndexOf("o"));

        // 5. Substring Operations
        System.out.println("Substring from index 11: " + sample.substring(11));
        System.out.println("Substring (11, 15): " + sample.substring(11, 15));

        // 6. String Modification
        System.out.println("Replace 'Java' with 'Python': " + sample.replace("Java", "Python"));
        System.out.println("To upper case: " + sample.toUpperCase());
        System.out.println("To lower case: " + sample.toLowerCase());
        System.out.println("String after trimming: '" + "   Trim me   ".trim() + "'");

        // 7. Whitespace Handling
        String strWithSpaces = "   Hello World   ";
        System.out.println("Before trim: '" + strWithSpaces + "'");
        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concatenatedStr = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenatedStr);

        // 9. String Splitting
        String colors = "Red,Blue,Green,Yellow";
        String[] colorArray = colors.split(",");
        System.out.println("Colors array:");
        for (String color : colorArray) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is fun");                          // Appending text
        sb.insert(4, " Programming");                 // Inserting text
        sb.replace(5, 14, " Language");               // Replacing part of the string
        sb.delete(0, 5);                              // Deleting part of the string
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 30;
        System.out.println(String.format("Name: %s | Age: %d", name, age));

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "student@example.com";
        boolean isValid = email.contains("@") && email.contains(".") &&
                          email.startsWith("student") && email.endsWith(".com");

        System.out.println("Email: " + email);
        System.out.println("Is valid email? " + isValid);
    }
}
