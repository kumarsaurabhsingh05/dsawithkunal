package practicequestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxInArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 32, 82, 9, 18};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
