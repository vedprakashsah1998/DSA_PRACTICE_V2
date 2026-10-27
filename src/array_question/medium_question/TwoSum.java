package array_question.medium_question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 11, 5};
//        System.out.println(Arrays.toString(twoSum3(arr, 14)));
//        System.out.println(twoSum4(arr, 14));
        twoSum4(arr, 14);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int more = target - nums[i];
            if (map.containsKey(more)) {
                return new int[]{map.get(more), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void twoSum4(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                result[0] = left;
                result[1] = right;
                break;
//                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(Arrays.toString(result));
//        return false;
    }

}
