package ca.jrvs.coding.challenges_qs;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        int ret = 0;
        for (int i = 2; i < n; i++) {
            int count = 0;
            int j;
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2) {
                ret++;
            }
        }return ret;
    }
}