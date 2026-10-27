package array_question.medium_question;

import java.util.HashMap;

public class SubArraySumEqK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(subArraySum(arr, k));
    }

    private static int subarraySum(int[] nums, int d) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += nums[j];

                if (sum == d) {
                    count++;
                }
            }
        }
        return count;
    }
    private static int subArraySum(int []nums,int k){
        int n =  nums.length, count =0, prefixSum = 0;

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        prefixSumCount.put(0,1);
        for(int i = 0; i < n; i++){
            prefixSum += nums[i];
            int remove = prefixSum-k;
            if(prefixSumCount.containsKey(remove)){
                count += prefixSumCount.get(remove);
            }
            prefixSumCount.put(prefixSum,prefixSumCount.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }
}
