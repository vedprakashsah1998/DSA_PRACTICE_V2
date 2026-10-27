package recursion;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
    }

    private static boolean isPalindrome(String str) {
        return isPalindrome(str, 0);
    }

    private static boolean isPalindrome(String str, int i) {
        if (i >= str.length() / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }
        return isPalindrome(str, i + 1);
    }

    private static boolean isPalindrome2(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome3(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String originalStr = s.toLowerCase();
        String rev = "";
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            rev = rev + originalStr.charAt(i);
        }
        return originalStr.equals(rev);
    }

}
