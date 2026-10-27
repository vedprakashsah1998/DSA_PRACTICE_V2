package array_question.easy_question;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        String secondLargestElement = "Second Largest Element: " + findSecondLargest(arr, n);
        System.out.println(secondLargestElement);

    }

    private static int findSecondLargest(int[] arr, int n) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            }
//            largest = Math.max(largest, arr[i]);
            if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
}
