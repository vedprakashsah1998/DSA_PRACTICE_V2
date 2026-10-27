package array_question.easy_question;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 4, 4, 3, 3};
        for (int i = 1; i < removeDuplicate(arr); i++) {
            System.out.print(arr[i] + " ");
        }
//        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int index = 0;
        for (int i = 0; i < set.size(); i++) {
            nums[index] = i;
            index++;
        }

        return index;
    }

    public static int removeDuplicate2(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
