public class Main {
    public static void main(String[] args) {
        // Task:
        // 1. Implement missing sorting algorithms.
        //    - InsertionSort.java
        //    - SelectionSort.java
        //
        //  2. Add a method to class Main to generate a random array.
        //  3. Provide random input to test suite and ensure your implementations
        //     of InsertionSort and Selection sort continue to work.
        //  4. Increase the loop count for TestSuite to get better performance results.

        int[] testInput = generateRandomArray(1000);  // Generating random array of size 1000

        // Increase the loop count to get better results once it works.
        // TestSuite.run(testInput, 10000); // Uncomment for more loops
        TestSuite.run(testInput, 1);  // Running for 1 iteration as an initial test
    }

    // Method to generate a random array of a given size
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 1000);  // Random values between 0 and 999
        }
        return array;
    }
}