package practicequestions;

public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        long number = 999999999;
        System.out.println("Sum of digits: " + sumOfDigits(number));
    }
    static long sumOfDigits(long num) {
        if (num == 0) return 0;
        long lastDigit = num % 10;
        return lastDigit + sumOfDigits(num / 10);
    }
}
