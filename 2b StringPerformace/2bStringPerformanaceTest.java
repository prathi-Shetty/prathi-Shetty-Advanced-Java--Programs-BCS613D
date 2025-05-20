/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is 
better.*/
package StringOpertaions;

import java.util.*;

public class stringPerfromaceTest {

    public static void main(String args[]) {

        final int ITERATIONS = 10000;      // Number of times to append the string
        final String text = "AIET";        // Text to append

        // Test StringBuffer (synchronized - thread-safe but slower)
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime(); // Start time
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(text);     // Append text
        }
        long endTimeBuffer = System.nanoTime();   // End time
        long durationBuffer = endTimeBuffer - startTimeBuffer; // Duration

        // Test StringBuilder (non-synchronized - faster but not thread-safe)
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime(); // Start time
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append(text);   // Append text
        }
        long endTimeBuilder = System.nanoTime();  // End time
        long durationBuilder = endTimeBuilder - startTimeBuilder; // Duration

        // Results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Performance comparison
        if (durationBuffer > durationBuilder) {
            System.out.println("✅ StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("✅ StringBuffer is faster than StringBuilder (unusual case).");
        }
    }
}
