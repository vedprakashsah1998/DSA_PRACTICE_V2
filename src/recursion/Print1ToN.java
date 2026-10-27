package recursion;

public class Print1ToN {
    public static void main(String[] args) {
//        printNumber(1, 5);
        printNumber(5);
    }

    public static void printNumber(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.print(current + " ");
        printNumber(current + 1, n);
    }

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }

        printNumber(n - 1);  // recursive call
        System.out.print(n + " ");
    }

}
