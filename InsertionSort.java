public class InsertionSort {
    /* Function to sort array using insertion sort */
    void sort(int list[])
    {
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && list[j] > key) {
                arr[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int list[])
    {
        int n = list.length;
        for (int i = 0; i < n; ++i)
            System.out.print(list[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int list[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(list);

        printArray(list);
    }
}
