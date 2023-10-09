package arrays;

public class BubbleSortWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap elements without using a third variable
                    arr[i - 1] = arr[i - 1] + arr[i];
                    arr[i] = arr[i - 1] - arr[i];
                    arr[i - 1] = arr[i - 1] - arr[i];
                    
                    swapped = true;
                }
            }
        } while (swapped);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
