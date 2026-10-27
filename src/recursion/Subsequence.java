package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> list = new ArrayList<>();
        subsequence(0, list, arr, arr.length);
    }

    private static void subsequence(int index, List<Integer> list, int[] arr, int n) {
        if (index == n) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            if (list.isEmpty()) {
                System.out.print("{}");
            }
            System.out.println();
            return;
        }

        list.add(arr[index]);
        subsequence(index + 1, list, arr, n);
        list.removeLast();
        subsequence(index + 1, list, arr, n);

    }
}
