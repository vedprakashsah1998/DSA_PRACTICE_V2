package array_question.medium_question;

import java.util.Arrays;

public class SortArrayZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void sortColor(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }

    }

  private static void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0,mid = 0, high = n - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,low++,mid++);
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid,high--);
            }
        }
  }
  private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
  }

}
