package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Example of hardcoded 2D array
        int[][] predefined = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Creating a 3x3 2D array using user input
        int[][] arr = new int[3][3];

        // Taking input for each cell
        System.out.println("Enter elements for 3x3 array:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Printing using nested loops
        System.out.println("\nArray using nested loops:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Printing each row using Arrays.toString()
        System.out.println("\nArray using Arrays.toString():");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Printing using enhanced for-each loop
        System.out.println("\nArray using enhanced for-each loop:");
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }

        // Extra Note:
        // int [][] zrr = new int[3][]; //adding rows is mandatory
        // Arrays are mutable in Java – changes to elements are reflected.
        // Strings are immutable – any modification returns a new String.
    }
}
