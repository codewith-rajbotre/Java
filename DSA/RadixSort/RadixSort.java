import java.util.Arrays;

public class RadixSort {

    // Function to get the maximum value in the array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    // A function to do counting sort based on a specific digit (exponent)
    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // output array
        int[] count = new int[10]; // digit ranges from 0 to 9

        // Count occurrences of each digit
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Change count[i] so it contains actual position of this digit
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy the output array to arr[]
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main function to implement Radix Sort
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Do counting sort for every digit (exp = 1, 10, 100, ...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Driver method to test the sorting
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}
