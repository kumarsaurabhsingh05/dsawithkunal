package practicequestions;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1231));
    }
    static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return num == rev;
    }
}
