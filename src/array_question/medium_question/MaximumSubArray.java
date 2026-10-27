package array_question.medium_question;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int [] nums = {-1,-2,-6};
//        System.out.println(maxSubArrayOptimal(nums, nums.length));
        maxSubArrayOptimalPrintArray(nums, nums.length);
    }

    /**
     * Time Complexity: O(N3) near
     * Space Complexity: O(1)
     */
    private static int maxSubArrayBrute(int[] nums, int n) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += nums[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }


    /**
     * Time Complexity: O(N2)
     * Space Complexity: O(1)
     */

    private static int maxSubArrayBetter(int[] nums, int n) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int maxSubArrayOptimal(int[] nums, int n) {
        long sum = 0, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
          /*  if (sum > maxi) {
                maxi = sum;
            }*/
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
//        if(maxi<0){
//            return 0;
//        }else{
//            return (int) maxi;
//        }
        return (int) maxi;

    }





    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static void maxSubArrayOptimalPrintArray(int[] nums, int n) {
        long sum = 0, maxi = Integer.MIN_VALUE;
        int ansStart = -1, ansEnd = -1;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
//        if(maxi<0){
//            return 0;
//        }else{
//            return (int) maxi;
//        }

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }

    }


}
