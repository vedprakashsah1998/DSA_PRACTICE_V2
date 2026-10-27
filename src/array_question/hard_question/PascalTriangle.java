package array_question.hard_question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;

        // Generate and print Pascal's Triangle
        for (List<Integer> row : generate(n)) {
            for (Integer val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    /**
     * give me element at place
     *
     * @param n
     * @param r
     * @return
     */
    public int findElementAtRowCol(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    private static void printEntireNthRowOfPascalTriangle(int n) {
        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans = ans * (n - 1);
            ans = ans / (i);
            System.out.println(ans);
        }
    }


    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> ansRow = new ArrayList<>(Collections.nCopies(i + 1, 1));
            for (int j = 1; j < i; j++) {
                ansRow.set(j, triangle.get(i - 1).get(j - 1) +
                        triangle.get(i - 1).get(j));
            }
            triangle.add(ansRow);
        }
        return triangle;
    }


}
