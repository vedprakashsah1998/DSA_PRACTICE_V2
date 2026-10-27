package array_question.easy_question;

public class RightRotateByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rightRotate(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void rightRotate(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }
}
