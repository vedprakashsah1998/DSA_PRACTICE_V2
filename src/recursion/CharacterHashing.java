package recursion;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] arr = new boolean[100_000_000_0];

        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
//            hash[str.charAt(i)-'a']++;
            arr[str.charAt(i)] = true;
            hash[str.charAt(i)]++;
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch]);
            System.out.println(arr[ch]);
        }
    }
}
