package array_question.hard_question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(majorityElement3(arr));
    }

    private static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            if (list.isEmpty() || list.getFirst() != nums[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                    }
                }
                if (count > nums.length / 3) {
                    list.add(nums[i]);
                }
            }
            if (list.size() == 2) {
                break;
            }

        }
        return list;
    }

    private static List<Integer> majorityElement2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int mini = n / 3 + 1;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) == mini) {
                list.add(nums[i]);
            }
            if (list.size() == 2) {
                break;
            }
        }
        return list;
    }

    private static List<Integer> majorityElement3(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != ele2) {
                count1 = 1;
                ele1 = nums[i];
            } else if (count2 == 0 && nums[i] != ele1) {
                count2 = 1;
                ele2 = nums[i];
            } else if (nums[i] == ele1) {
                count1++;
            } else if (nums[i] == ele2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (ele1 == nums[i]) {
                count1++;
            }
            if (ele2 == nums[i]) {
                count2++;

            }
        }
        int mini = n / 3 + 1;
        if (count1 >= mini) {
            result.add(ele1);
        }
        if (count2 >= mini) {
            result.add(ele2);
        }


        return result;

    }

}
