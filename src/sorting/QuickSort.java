package sorting;

public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {3, 5, 1, 6, 7, 8, 0, 8, 9};
        int[] arr = {33, 9, 4, 5, 11, 8, 7, 0, 3, 1, 3};
//        quickSort(arr, 0, arr.length - 1);
        quickSortForLoop(arr, 0, arr.length - 1);
//        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
                swap(arr, i, j);
            }
        }
//        int temp = arr[low];
//        arr[low] = arr[j];
//        arr[j] = temp;
        swap(arr, low, j);
        return j;

    }

    public static void quickSortForLoop(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partitionIndex(arr, low, high);
            quickSortForLoop(arr, low, pidx - 1);
            quickSortForLoop(arr, pidx + 1, high);
        }
    }

    private static int partitionIndex(int[] arr, int low, int high) {

        int pivotElement = arr[high];
        int i = low - 1;
//        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivotElement) {
                i++;
                //swap
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
                swap(arr, i, j);
            }
        }
        i++;
//        int temp = arr[i];
//        arr[i] = pivot;
//        arr[high] = temp;
        swap(arr, i, high);
        return i;


    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
