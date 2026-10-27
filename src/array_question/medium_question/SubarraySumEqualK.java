package array_question.medium_question;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 * <p>
 * A subarray is a contiguous non-empty sequence of elements within an array.
 */
public class SubarraySumEqualK {
    public static void main(String[] args) {
        int[] arr = {9, 4, 20, 3, 10, 5};
        System.out.println(subarraySum2(arr, arr.length, 33));
    }

    public static int subarraySum(int[] nums, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int subarraySum2(int[] nums, int n, int k) {
        int count = 0;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            if (prefixSum[j] == k) {
                count++;
            }
            int val = prefixSum[j] - k;
            if (map.containsKey(val)) {
                count += map.get(val);
            }

            if (!map.containsKey(prefixSum[j])) {
                map.put(prefixSum[j], 0);
            }
            map.put(prefixSum[j], map.getOrDefault(prefixSum[j], 0) + 1);

        }
        return count;
    }


}
