package array_question.easy_question;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6};
        int[] arr2 = {1, 2, 3, 4, 5};
        int n = arr1.length;
        int m = arr2.length;
//        unionUsingSet(arr1, arr2).iterator().forEachRemaining(x -> System.out.print(x + " "));
        union(arr1, arr2, n, m).iterator().forEachRemaining(x -> System.out.print(x + " "));
    }


    public static List<Integer> union(int[] arr1, int[] arr2, int n, int m) {

        int i = 0;
        int j = 0;
        List<Integer> union = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.getLast() != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (union.isEmpty() || union.getLast() != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (union.isEmpty() || union.getLast() != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static Set<Integer> unionUsingSet(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr1) {
            set.add(j);
        }
        for (int j : arr2) {
            set.add(j);
        }
        return set;
    }

}
