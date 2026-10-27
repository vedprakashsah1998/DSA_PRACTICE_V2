package basic_math;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = -214;

        System.out.println(reverse32BitInteger(n));
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            int ld = x % 10;
            rev = rev * 10 + ld;
            x = x / 10;
        }
        return rev;
    }

    public static int reverse32BitInteger(int x) {
        long rev = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        while (x > 0) {
            int ld = x % 10;
            rev = rev * 10 + ld;
            x = x / 10;
            if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return (int) rev * sign;
    }


}
