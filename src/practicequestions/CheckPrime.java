package practicequestions;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(117));
    }
    static boolean isPrime(int n) {
        int c = 2;
        if (c < n) {
            if (n % c == 0) {
                c = c+ 1;
                return false;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
