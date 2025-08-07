package arrays;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println("Before swap" + Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println("After swap" +Arrays.toString(arr));
    }

    static void swap(int[] arr,int index1,int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }
}
