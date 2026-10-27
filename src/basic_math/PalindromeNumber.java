package basic_math;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 131;
        String palindromeCheck = isPalindrome(n) ? n + " Palindrome" : n + " Not a palindrome";
      /*  if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }*/
        System.out.println(palindromeCheck);
    }

    public static boolean isPalindrome(int n) {
        int reversed = 0;
        int dup = n;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed == dup;
    }

    public static boolean isPalindrome2(int n) {
        if (n < 0 || (n % 10 == 0 && n != 0)) {
            return false;
        }
        int revHalf = 0;
        while (n > revHalf) {
            revHalf = revHalf * 10 + n % 10;
            n = n / 10;
        }
        return n == revHalf || n == revHalf / 10;
    }
}
