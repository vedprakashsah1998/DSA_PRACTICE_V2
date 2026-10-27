package array_question.easy_question;

public class SecondLargestSecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        String secondLargestSecondSmallest = "Second Largest Element: " + findSecondLargest(arr, n) + "\n" + "Second Smallest Element: " + findSecondSmallest(arr, n);
        System.out.println(secondLargestSecondSmallest);
    }

    public static int findSecondLargest(int[] arr, int n) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }

           /* largest = Math.max(largest, arr[i]);
            sLargest = Math.min(sLargest, largest);
            if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }*/
        }
        return sLargest;
    }

    public static int findSecondSmallest(int[] arr, int n) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

}
