/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as follows1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/
package listOperations;
import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        addElements(arrayList);
        addElements(linkedList);

        addElementAtIndex(arrayList, 1, "Mango");
        addElementAtIndex(linkedList, 1, "Mango");

        addMultipleElements(arrayList, Arrays.asList("Pineapple", "Grapes"));
        addMultipleElements(linkedList, Arrays.asList("Pineapple", "Grapes"));

        accessElement(arrayList, 2);
        accessElement(linkedList, 2);

        updateElement(arrayList, 0, "Kiwi");
        updateElement(linkedList, 0, "Kiwi");

        removeElement(arrayList, "Banana");
        removeElement(linkedList, "Banana");

        searchElement(arrayList, "Orange");
        searchElement(linkedList, "Orange");

        listSize(arrayList);
        listSize(linkedList);

        iterateList(arrayList);
        iterateList(linkedList);

        useIterator(arrayList);
        useIterator(linkedList);

        sortList(arrayList);
        sortList(linkedList);

        getSubList(arrayList, 1, 3);
        getSubList(linkedList, 1, 3);

        clearList(arrayList);
        clearList(linkedList);
    }

    static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Added elements: " + list);
    }

    static void addElementAtIndex(List<String> list, int index, String element) {
        list.add(index, element);
        System.out.println("After adding at index " + index + ": " + list);
    }

    static void addMultipleElements(List<String> list, List<String> elements) {
        list.addAll(elements);
        System.out.println("After adding multiple elements: " + list);
    }

    static void accessElement(List<String> list, int index) {
        System.out.println("Element at index " + index + ": " + list.get(index));
    }

    static void updateElement(List<String> list, int index, String newValue) {
        list.set(index, newValue);
        System.out.println("After updating element at index " + index + ": " + list);
    }

    static void removeElement(List<String> list, String value) {
        list.remove(value);
        System.out.println("After removing '" + value + "': " + list);
    }

    static void searchElement(List<String> list, String value) {
        boolean found = list.contains(value);
        System.out.println("Is '" + value + "' in list? " + found);
    }

    static void listSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    static void iterateList(List<String> list) {
        System.out.print("Iterating: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    static void useIterator(List<String> list) {
        System.out.print("Using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }

    static void getSubList(List<String> list, int fromIndex, int toIndex) {
        List<String> sub = list.subList(fromIndex, toIndex);
        System.out.println("Sublist (" + fromIndex + "-" + toIndex + "): " + sub);
    }

    static void clearList(List<String> list) {
        list.clear();
        System.out.println("List cleared. Current contents: " + list);
    }
}
