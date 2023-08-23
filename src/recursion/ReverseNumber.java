package recursion;

public class ReverseNumber {
    static int sum = 0; // this is cheating because it's not in recursive call.
    static void reverse1(int n) {
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n / 10);
    }

    static int reverse2(int n) {
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n, digit);
    }
    private static int helper(int n, int digits) {
        if (n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }

    static boolean palindrome(int n) {
        return n == reverse2(n);
    }

    public static void main(String[] args) {
//        reverse1(235);
//        System.out.println(sum);
        System.out.println(reverse2(12345));
        System.out.println(palindrome(123421));
    }

}
