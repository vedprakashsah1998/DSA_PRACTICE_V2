package basic_math;

import static java.lang.Math.log10;

public class CountDigit {
    public static void main(String[] args) {
        int n = 7789;
        int count = 0;
       /* while(n>0){
            count++;
            n = n/10;
        }*/
        int count1 = (int) Math.log10(n) + 1;
        System.out.println(count1);
    }
}
