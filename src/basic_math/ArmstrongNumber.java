package basic_math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 371;
        int k = String.valueOf(number).length();
        int sum = 0;
        int n = number;
        while (n > 0) {
            int ld = n % 10;
            sum += (int) Math.pow(ld, k);
            n = n / 10;
        }
        if (sum == number) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}
