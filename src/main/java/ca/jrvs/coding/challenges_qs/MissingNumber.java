package ca.jrvs.coding.challenges_qs;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        for (int k = 0; k < n + 1; k++) {
            if (!map.containsKey(k)) {
                return k;
            }
        } return -1;
    }

    public int missingNumberMaths(int[] nums) {
        int n = nums.length;
        int inputsum = 0;
        for (int i = 0; i < n; i++) {
            inputsum = inputsum + nums[i];
        }
        int expectedsum = 0;
        for (int i = 0; i <= n; i++) {
            expectedsum = expectedsum + i;
        }
        return (expectedsum - inputsum);
    }
}