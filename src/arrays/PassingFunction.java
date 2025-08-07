package arrays;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(nums));

        // Function call that modifies the array
        change(nums);

        System.out.println("Array after calling change():");
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        // Modify the first element of the array
        arr[0] = 99;
    }

    /*
     * Explanation:
     * Arrays in Java are objects. When passed to a method, the reference to the array
     * is passed (not the actual array, but a copy of its reference).
     * So any modification done inside the function affects the original array.
     *
     * Output:
     * [2, 3, 4, 5]
     * [99, 3, 4, 5]
     */
}
