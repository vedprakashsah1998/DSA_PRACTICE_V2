package array_question.easy_question;

import java.util.ArrayList;
import java.util.List;

public class ZeroShifting {
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 1, 0, 0, 2, 5, 6, 7, 3, 0};
        int n = arr.length;
        for (int i : zeroShifting2(arr, n)) {
            System.out.print(i + " ");
        }

        System.out.println();
//        System.out.println(linearSearch(arr, 1));
    }

    public static int[] zeroShifting(int[] arr, int n) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        int nonZero = temp.size();
        for (int i = 0; i < nonZero; i++) {
            arr[i] = temp.get(i);
        }
        for (int i = nonZero; i < n; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    /**
     *<br> <H3>LeetCode 283</H3></br>
     * <a href="https://leetcode.com/problems/move-zeroes/description/">283. Move Zeroes</a>
     * <p>Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     * <br>Example 1:
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]</br>
     * Example 2:
     * Input: nums = [0]
     * Output: [0]</p>
     */
    public static int[] zeroShifting2(int[] arr, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return arr;
        }
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
