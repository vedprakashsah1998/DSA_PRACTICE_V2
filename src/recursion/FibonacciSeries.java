package recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
//        for (int i = 0;i<=n;i++){
//            System.out.print(fibonacci(i)+" ");
//
//        }
//        System.out.println();
        System.out.println(fibonacci(n));
        fibonacci2(n);
    }

    public static int fibonacci(int n) {
        // Base case: return N if it's 0 or 1
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // iterative fibonacci Series
    public static void fibonacci2(int n) {

        int n1 = 0, n2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }

    }
}
