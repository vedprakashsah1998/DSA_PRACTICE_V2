package recursion;

public class PrintNTimesName {
    public static void main(String[] args) {
        String name = "Ved Prakash";
        int N = 5;

        printName(name, 1, N);
        printNTimesName(name, N);
    }

    public static void printName(String name, int count, int n) {
        if (count > n) {
            return;
        }
        System.out.println(name + " " + (count));
        printName(name, count + 1, n);
    }

    public static void printNTimesName(String name, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(name);
        printNTimesName(name, n - 1);
    }
}
