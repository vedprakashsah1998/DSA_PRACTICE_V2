package array_question.medium_question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement3(arr));
    }

   private static int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                return nums[i];
            }
        }
        return -1;
   }

    /**
     * time complexity : O(N log N) + O(N)
     * Space Complexity: O(N)
     */

    private static int majorityElement2(int[] nums) {
        int n = nums.length;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }

    private static int mooreAlgo(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ele = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                ele = nums[i];
            } else if (nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele) {
                count1++;
            }
        }
        if (count1 > n / 2) {
            return ele;
        }


        return -1;
    }

    /**
     * Time Complexity: O(NLogN)
     */
    private static int majorityElement3(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int freq = 1, ans = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                freq++;
            } else {
                freq = 1;
                ans = nums[i];
            }

            if (freq > n / 2) {
                return ans;
            }
        }
        return ans;
    }

}
