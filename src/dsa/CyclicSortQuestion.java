package dsa;

public class CyclicSortQuestion {
    public static void main(String[] args) {

    }
    static int cyclicSortQue(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        // Search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == i){
                return index;
            }
        }
        // case 2 : if the length == n and not found the length
        return arr.length;
    }
}
