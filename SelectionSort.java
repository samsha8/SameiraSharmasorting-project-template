import java.util.Arrays;

class GfG {

    static void selectionSort(int[] list){
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
          
            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[min_idx]) {
                  
                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = list[i];
            list[i] = list[min_idx];
            list[min_idx] = temp;           
        }
    }

    static void printArray(int[] list){
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
  
    public static void main(String[] args){
        int[] list = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(list);

        selectionSort(list);

        System.out.print("Sorted array: ");
        printArray(list);
    }
}