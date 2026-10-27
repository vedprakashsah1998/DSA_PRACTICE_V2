package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 11, 1, 66, 34, 6435, 23454};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}