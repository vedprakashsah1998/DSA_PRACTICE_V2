package array_question.easy_question;

/**
 * Find number which appears one
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1, 0, 6, 8, 8, 0, 1};
        System.out.println("single: " + singleNumber2(arr, arr.length));
    }

    public static int singleNumber(int[] nums, int n) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            ans = nums[i];
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                return ans;
            }
        }
        return ans;
    }

    public static int singleNumber2(int[] nums, int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
