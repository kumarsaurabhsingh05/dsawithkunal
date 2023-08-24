package dsa;

public class CyclicSortQuestions3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicateNumber(arr));
    }
    static int findDuplicateNumber(int[] arr) {
        int i = 0;
        int ans = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }
                else {
                    return arr[i];
                }
            } else {
                i++;
            }
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == index + 1) {
               ans = index;
            }
        }
        return ans;
    }
}
