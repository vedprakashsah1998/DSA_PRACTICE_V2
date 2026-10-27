package array_question.easy_question;

public class LargestElementInArray {
    public static void main(String[] args) {

        int[] nums = {3,2,66,22,111,44};
        System.out.println(findLargest(nums));
    }

    private static int findLargest(int[] nums) {
        int largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
