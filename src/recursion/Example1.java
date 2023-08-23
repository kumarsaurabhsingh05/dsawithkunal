package recursion;

public class Example1 {
    public static void main(String[] args) {
        printBoth(5);
    }
    static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    static void printRev(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printRev(n-1);
    }
    static void printBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);

    }

}
