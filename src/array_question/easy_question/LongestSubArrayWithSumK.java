package array_question.easy_question;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 4, 2, 3};
        System.out.println(longestSubarray3(arr, 3, arr.length));
    }

    public static int longestSubarray(int[] arr, int sumValue, int n) {
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {

              /*  for (int k = i; k <= j; k++) {
                    sum += arr[k];

                }*/
                sum += arr[j];
                if (sum == sumValue) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;

    }


    public static int longestSubarray2(int[] arr, long sumValue, int n) {
        Map<Long, Integer> map = new HashMap<>();

        long sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == sumValue) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum - sumValue;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return Math.toIntExact(maxLen);

    }

    /**
     * positive number and zero contains in array
     *
     * @return
     */
    public static int longestSubarray3(int[] arr, int sumValue, int n) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        long sum = arr[0];
        while (right < n) {
            while (left <= right && sum > sumValue) {
                sum -= arr[left];
                left++;
            }
            if (sum == sumValue) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n)
                sum += arr[right];
        }
        return maxLen;


    }


}
