package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax explanation:
        // ArrayList<Integer> list = new ArrayList<>(10);
        // - Creates a dynamic array (size grows automatically)
        // - Stores Integer objects (not primitive int)
        // - Initial capacity is 10 (not fixed; grows as needed)

        ArrayList<Integer> list = new ArrayList<>(10);

        // Adding elements manually
        list.add(67);
        list.add(32);
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(627);
        list.add(321);
        list.add(671);
        list.add(324);
        list.add(322);
        list.add(320);

        // Print entire list
        System.out.println("Initial list:");
        System.out.println(list);

        // Check if list contains a value
        System.out.println("Does list contain 3? " + list.contains(3)); // true

        // Remove element at index 10
        System.out.println("Removed element at index 10: " + list.remove(10));

        // Add user input (5 numbers)
        System.out.println("Enter 5 integers to add to the list:");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // Print first 5 elements using .get()
        System.out.println("First 5 elements in the list:");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
            // Note: list[i] doesn't work because ArrayList is an object,
            // and elements are accessed using .get(index)
        }

        // Additional useful ArrayList methods
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Index of 67: " + list.indexOf(67));
        System.out.println("Last index of 3 (if duplicate): " + list.lastIndexOf(3));

        // ArrayList allows duplicates
        list.add(333);
        list.add(18);
        System.out.println("List after adding duplicates:");
        System.out.println(list);

        // Clear the entire list
        // list.clear();
        // System.out.println("List after clearing: " + list);
        //ArrayList allows duplicates because it maintains insertion order and does not enforce uniqueness (unlike Set).
    }
}
