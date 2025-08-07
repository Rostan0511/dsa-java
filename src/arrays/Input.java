package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Taking input from user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Printing array using Arrays.toString()
        System.out.println("\nArray (using Arrays.toString):");
        System.out.println(Arrays.toString(arr));

        // Printing array using enhanced for-loop
        System.out.println("\nArray (using for-each loop):");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Uncommenting the line below will throw ArrayIndexOutOfBoundsException
        // System.out.println(arr[5]); // Index out of bounds
    }
}
