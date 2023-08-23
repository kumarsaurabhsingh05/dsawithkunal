package recursion;

public class SumTillN {
    public static void main(String[] args) {
        System.out.println(sumOfNumberTillN(100));
    }
    static int sumOfNumberTillN(int n) {
        if (n <= 1) return 1;
        return n + sumOfNumberTillN(n -1);
    }
}
