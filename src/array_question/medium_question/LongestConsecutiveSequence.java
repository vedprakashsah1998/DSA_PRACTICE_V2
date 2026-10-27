package array_question.medium_question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive2(arr));
    }

    private static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int longest = 0;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int count = 1;
            while (linearSearch(nums, x + 1)) {
                x++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    private static boolean linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }


    private static int longestConsecutive2(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        Arrays.sort(nums);
        int longest = 1;
        int count = 0;
        int lastSmallest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastSmallest) {
                count++;
            } else if (lastSmallest != nums[i]) {
                count = 1;
            }
            lastSmallest = nums[i];
            longest = Math.max(longest, count);
        }
        return longest;
    }


    private static int longestConsecutive3(int[] nums) {
        int n = nums.length;
        int longest = 1;
        if (n == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        for (int it : set) {
            if (!set.contains(it - 1)) {
                int count = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
