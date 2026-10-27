package recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
//        printNumber(10, 1);
        printNTo1(10);
    }

    public static void printNumber(int current, int n) {
        if (current < n) {
            return;
        }
        System.out.print(current + " ");
        printNumber(current - 1, n);
    }

    public static void printNTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }

}
