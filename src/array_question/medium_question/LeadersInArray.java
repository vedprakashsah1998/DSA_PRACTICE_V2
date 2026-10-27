package array_question.medium_question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
//        leadersInArray(arr);
        System.out.println(leadersInArray2(arr));
    }

    private static void leadersInArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        boolean leader = false;
        for (int i = 0; i < n; i++) {
            leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    private static List<Integer> leadersInArray2(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                list.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }

        Collections.sort(list);
        return list;
    }

}
