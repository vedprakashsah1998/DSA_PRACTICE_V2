package array_question.easy_question;

import java.util.Arrays;

public class LeftRotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
//        System.out.println(Arrays.toString(rightRotate(arr, k)));
        System.out.println(Arrays.toString(rotateLeft(arr, k)));

    }

    public static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
//        int j = 0;
//        for (int i = n - k; i < n; i++) {
//            arr[i] = temp[j];
//            j++;
//        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }
        return arr;
    }

    private static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i + n - k];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }


    public static int[] rotateLeft2(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0) {
            return arr;
        }
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }

    /**
     * <br><H2>LeetCode 189</H2></br>
     * <a href = "https://leetcode.com/problems/rotate-array/description/">189. Rotate Array</a>
     */

    public static int[] rightRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0) {
            return arr;
        }
        k %= n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        return arr;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
