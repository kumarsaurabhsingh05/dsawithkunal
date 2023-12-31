package arrays;

public class FindThirdLargestElement {
    public static void main(String[] args) {

        int[] arr = {3,5,6,7,1,9};
        System.out.println(findThirdLargestElement(arr));

    }

    public static int findThirdLargestElement(int[] arr) {
        int length = arr.length;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[length-3];
    }

}