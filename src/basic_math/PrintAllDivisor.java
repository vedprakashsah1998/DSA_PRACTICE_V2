package basic_math;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisor {
    public static void main(String[] args) {
        int n = 44;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
