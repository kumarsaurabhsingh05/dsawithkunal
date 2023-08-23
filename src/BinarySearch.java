public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 15, 23, 34, 54, 55, 65, 66, 76, 84, 89};
        System.out.println(binarySearch(arr, 84));
    }

    // return the index
    // return -1 if element not found
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // find the middle element
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }

        return -1;

    }
}
