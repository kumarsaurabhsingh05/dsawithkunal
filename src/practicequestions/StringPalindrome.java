package practicequestions;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abacaba"));
    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder reversedString = new StringBuilder(str).reverse();
        return str.equals(reversedString.toString());
//        for (int i = 0; i <= str.length() / 2; i++) {
//            char start = str.charAt(i);
//            char end = str.charAt(str.length() - 1 - i);
//            if (start != end) return false;
//        }
//        return true;
    }
}
