package practicequestions;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxInRange(arr, 1, 4));
    }
    static int max(int[] arr) {
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                num = arr[i];
            }
        }
        return num;
    }
    static int maxInRange(int[] arr, int index1, int index2) {
        int num = Integer.MIN_VALUE;
        for (int i = index1; i <= index2; i++) {
            if (arr[i] > num) {
                num = arr[i];
            }
        }
        return num;
    }
}
