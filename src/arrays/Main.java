package arrays;

public class Main {
    public static void main(String[] args) {

        // Q: Store a roll number
        int a = 24;

        // Q: Store a name
        String name = "Tony";

        // Q: Store 5 roll numbers
        // An array is a collection of data of the same type

        // Declaration
        int[] roll_no = new int[5]; // 'new' creates an object in the heap

        // Or using literal array initialization
        int[] roll = {23, 12, 35, 42, 22};

        // Declaration and initialization separately
        int[] ros; // 'ros' declared in stack
        ros = new int[5]; // actual array object created in heap

        // Default values
        System.out.println(ros[0]); // prints 0 (default for int)

        String[] names = new String[5];
        System.out.println(names[0]); // prints null (default for String)

        // Assigning value to array
        roll[0] = 99;
        System.out.println(roll[0]); // prints 99
    }
}

/*
📌 Notes:

- Arrays in Java are objects stored in the heap.
- Even though arrays *look* like they're stored contiguously, the JVM may not guarantee it.
  (In Java Language Specification, it's stated that heap memory may not be contiguous.)
- The default values of primitive arrays:
    int[] → 0
    boolean[] → false
    String[] or Object[] → null
- 'new' keyword is used to create the actual array object.
- Variable (like ros) is in stack, actual data is in heap.
*/
