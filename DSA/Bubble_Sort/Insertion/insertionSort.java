public class insertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];      // Element to be compared
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the sort
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 6, 2};
        System.out.println("Before sorting:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }
}
