package array_question.easy_question;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSortedArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr1 = {2, 3, 3, 5, 6, 6, 7};
        int n = arr.length;
        int m = arr1.length;
        intersection2(arr, arr1, n, m).forEach(System.out::println);
    }

    public static List<Integer> intersection(int[] arr1, int[] arr2, int n, int m) {

        List<Integer> ans = new ArrayList<>();
        int[] vis = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j] && vis[j] == 0) {
                    ans.add(arr1[i]);
                    vis[j] = 1;
                    break;
                }
                if (arr2[j] > arr1[i]) break;
            }
        }
        return ans;
    }

    public static List<Integer> intersection2(int[] arr1, int[] arr2, int n, int m) {
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;

            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        return ans;
    }


}
