package ca.jrvs.coding.challenges_qs;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        int len = nums.length;
        int counter = 1;
        if (len != 0) {
            set.add(nums[0]);
            for (int i = 0; i < len; i++) {
                if (!(set.contains(nums[i]))) {
                    set.add(nums[i]);
                    nums[counter] = nums[i];
                    counter += 1;
                }
            }
            return set.size();
        }
        return 0;
    }
}