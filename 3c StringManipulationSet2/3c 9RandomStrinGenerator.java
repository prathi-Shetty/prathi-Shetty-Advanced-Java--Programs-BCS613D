/*Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()*/
package StringOpertaions;

import java.util.*;

public class RandomStringGenerator {

    // Method to generate a random alphanumeric string of a given length
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }

    public static void main(String[] args) {
        int length = 10; // You can change the length as needed
        String randomStr = generateRandomString(length);
        System.out.println("Generated Random String: " + randomStr);
    }
}
