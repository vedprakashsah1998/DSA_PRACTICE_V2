package array_question.easy_question;

public class ArrayLargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int n = arr.length;
        System.out.println(largestElement(arr, n));
    }

    public static int largestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
/*            if (arr[i] > arr[i+1]) {
                max = arr[i];
            }*/
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
