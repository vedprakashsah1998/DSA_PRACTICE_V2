package array_question.easy_question;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    /**
     * <br><H3>LeetCode 485.</H4></br>
     * <br><a href ="https://leetcode.com/problems/max-consecutive-ones/description/">Max Consecutive Ones</></br>
     * <p>Given a binary array nums, return the maximum number of consecutive 1's in the array.
     * <br>Example 1:
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3</br>
     * <br>Explanation: The first two digits or the last three digits are consecutive 1s.
     * The maximum number of consecutive 1s is 3.</br>
     * Example 2:
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2</p>
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
