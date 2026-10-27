package array_question.easy_question;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] >= nums[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * <br>LeetCode Problem<br/>
     * <a href="https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/">Check if Array is Sorted or Rotated</a>
     */
    public static boolean check2(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

}
