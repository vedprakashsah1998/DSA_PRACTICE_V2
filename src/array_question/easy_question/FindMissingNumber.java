package array_question.easy_question;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(findMissingNumber6(arr));
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] == i) {
                    flag = i;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return 0;
    }

    public static int findMissingNumber2(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            hash[nums[i]] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return 0;

    }

    public static int findMissingNumber3(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int sum2 = 0;
        for (int num : nums) {
            sum2 += num;
        }
        return (sum - sum2);

    }

    public static int findMissingNumber4(int[] nums) {
        int n = nums.length;
        int xor = 0, xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ nums[i];
            xor = xor ^ (i + 1);
        }
        return xor ^ xor2;
    }

    public static int findMissingNumber5(int[] nums) {
        int n = nums.length;
        int xor = 0, xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ nums[i];
            xor = xor ^ (i + 1);
        }
        xor = xor ^ n;
        return xor ^ xor2;
    }


    public static int findMissingNumber6(int[] nums) {
        int n = nums.length;
        int xor = n;
        for (int i = 0; i < n; i++) {
            xor = xor ^ i;
            xor = xor ^ nums[i];
        }

        return xor;
    }
}
