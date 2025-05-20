/*1. Write a Java program to iterate through all elements in a linked list starting at thespecified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package listOperations;

import java.util.*;

public class IterateFromSecond {

    public static void main(String[] args) {

        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Iterate from the 2nd position (index 1)
        System.out.println("Iterating from 2nd position:");
        ListIterator<String> iterator = colors.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
