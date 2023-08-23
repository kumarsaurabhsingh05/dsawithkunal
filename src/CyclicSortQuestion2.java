import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortQuestion2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = findMissingNumber(arr);
        System.out.println(list);
    }
    static List<Integer> findMissingNumber(int[] nums) {
        int i = 0;
        List<Integer> integers = new ArrayList<>();
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                integers.add(index+1);
            }
        }
        return integers;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
