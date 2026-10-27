package array_question.easy_question;

public class FindMissingRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 2, 1};
        for (int i : findMissingRepeatingNumbers2(arr, arr.length)) {
            System.out.print(i + " ");
        }

    }

    public static int[] findMissingRepeatingNumbers(int[] arr, int n) {
        int missing = -1, repeating = -1;
        int[] result = new int[2];
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j <= n - 1; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                repeating = i;
            } else if (count == 0) {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }

        }
        result[0] = missing;
        result[1] = repeating;
        return result;

    }

    public static int[] findMissingRepeatingNumbers2(int[] arr, int n) {
        int[] result = new int[2];
        int[] hash = new int[n + 1];
        int repeating = -1, missing = -1;
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) repeating = i;
            else if (hash[i] == 0) missing = i;
            if (repeating != -1 && missing != -1) {
                break;
            }
        }
        result[0] = repeating;
        result[1] = missing;
        return result;
    }

}
