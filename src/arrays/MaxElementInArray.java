package arrays;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {5, 31, 68, 82, 1};

        // Find max in entire array
        System.out.println("Maximum in full array: " + max(arr));

        // Find max in a subrange of the array
        int start = 0, end = 2;
        System.out.println("Maximum in range [" + start + ", " + end + "]: " + maxRange(arr, start, end));
    }

    // Function to find maximum in the whole array
    static int max(int[] arr) {
        int max = arr[0]; // assume first element is the max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max if current is greater
            }
        }

        return max;
    }

    // Function to find maximum in a specific range of the array
    static int maxRange(int[] arr, int start, int end) {
        // Basic input validation
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        if (start < 0 || end >= arr.length || start > end) {
            throw new IllegalArgumentException("Invalid range: " + start + " to " + end);
        }

        int max = arr[start]; // assume start index value is max

        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max if current is greater
            }
        }

        return max;
    }
}
