package recursion;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fiboSeries(6));
    }
    static int fibo(int n) {
        if (n < 2) return n;
        return fibo(n - 1) + fibo(n - 2);
    }
    static List<Integer> fiboSeries(int n) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        for (int i =0; i < n; i++) {
            fibonacciSeries.add(fibo(i));
        }
        return fibonacciSeries;
    }
}
