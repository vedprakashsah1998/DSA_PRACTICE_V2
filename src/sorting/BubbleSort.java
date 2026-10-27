package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 5, 2, 6, 27, 8, 0, 9};
        for (int i : bubbleSort(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length - 1;
        for (int i = n; i > 1; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
        return arr;
    }
}
