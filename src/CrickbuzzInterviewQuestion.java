import java.util.ArrayList;
import java.util.List;

public class CrickbuzzInterviewQuestion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(search(list, 0));

    }

    public static int search(List<Integer> nums, int target) {

        int low = 0;
        int high = nums.size() - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums.get(mid) == target) {
                return mid;
            }

            // Left half is sorted
            if (nums.get(low) <= nums.get(mid)) {

                if (nums.get(low) <= target && target < nums.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            // Right half is sorted
            else {

                if (nums.get(mid) < target && target <= nums.get(high)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
