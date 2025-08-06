package arrays;

public class Main {
    public static void main(String[] args) {
        //Q:store a roll num
        int a = 24;
        //Q:store name
        String name = "Tony";

        //Q:store 5 roll numbs
        // array is a collection of datatypes, similar datatype
        // datatype[] arr_var__name = new datatype[size]; decleration
        int[] roll_no = new int[5];
        // or
        int[] roll = {23,12,35,42,22};
        int[] ros; //decleration of array. ros is getting defined in stack
        ros = new int[5]; //object being created in memory heap initialization

        System.out.println(roll[0]);
    }
}

// no proof of heap obj whether its continous or not