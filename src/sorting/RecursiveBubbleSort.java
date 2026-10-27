package sorting;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        bubbleSort(arr, n);
        for (int j : arr) System.out.print(j + " ");
    }

    public static void bubbleSort(int[] arr, int n) {
        if (n == 1) return;
        boolean didSwap = false;

        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                didSwap = true;
            }
        }

        if (!didSwap) return;
        bubbleSort(arr, n - 1);
    }

}
