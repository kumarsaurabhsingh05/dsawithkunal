package recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(125550054));
    }
    static int countZero(int n) {
        return helper(n, 0);
    }
    private static int helper(int n, int count) {
        if (n == 0) return count;
        int rem = n % 10;
        if (rem == 5) return helper(n / 10, count + 1);
        return helper(n / 10, count);
    }
}