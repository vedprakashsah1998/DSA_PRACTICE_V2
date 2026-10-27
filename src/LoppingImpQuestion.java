import java.util.HashMap;

public class LoppingImpQuestion {
    /**
     * this question asked in crickbuzz
     * int arr[] = {2,4,0,5,0,2,2,3,0};
     * shift zero to last and count frequency of each element
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 5, 0, 2, 2, 3, 0};
        arrayShift(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        countSequence(arr);
    }

    public static void arrayShift(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }


    public static void countSequence(int[] arr) {
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != -1) {
                System.out.println(arr[i] + " -> " + map.get(arr[i]));
                map.put(arr[i], -1); // mark printed
            }
        }
    }

}
