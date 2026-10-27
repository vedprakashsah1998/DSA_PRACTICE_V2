package basic_math;

import java.util.BitSet;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 13;
        String primeNo = isPrimeValue(n) ? n + " is a prime number" : n + " is not a prime number";
       /* if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }*/
        System.out.println(primeNo);
//        System.out.println(isPrimeValue(n));
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }
        return count == 2;
    }


    public static int countPrime(int n) {
        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            int count = 0;

            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                    if (i / j != j) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                primeCount++;
            }
        }

        return primeCount;
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (checkPrime(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     *
     * here condition from leetcode print count of prime but count less than the number
     *
     * @param n
     * @return
     */
    public static int countPrimes2(int n) {
        boolean[] nonPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!nonPrime[i]) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    nonPrime[i * j] = true;
                }
            }
        }
        return count;
    }

    public static int countPrimesBitSet(int n) {
        if (n <= 2)
            return 0;

        BitSet nonPrime = new BitSet(n);

        int count = n / 2; // assume all odds are prime initially

        for (int i = 3; i * i < n; i += 2) {
            if (!nonPrime.get(i)) {
                for (int j = i * i; j < n; j += 2 * i) {
                    if (!nonPrime.get(j)) {
                        nonPrime.set(j);
                        count--;
                    }
                }
            }
        }

        return count;
    }

    private static boolean isPrimeValue(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
