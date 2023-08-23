package lambda;

public class Solution {
    public static void main(String[] args) {
        CalculateSum calculateSum = (a, b) -> (a + b);
        System.out.println(calculateSum.sum(2,4));
    }
}
