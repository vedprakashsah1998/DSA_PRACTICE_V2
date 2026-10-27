package recursion;

public class SumOfFirstNNaturalNo {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(10));
    }

    private static int sumOfNatualNo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static int sumOfNatualNo2(int n) {
        return n * (n + 1) / 2;
    }

    private static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
}
