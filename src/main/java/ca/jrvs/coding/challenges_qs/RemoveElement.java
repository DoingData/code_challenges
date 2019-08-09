package ca.jrvs.coding.challenges_qs;

/**
 * Given an array nums and a value val, remove all instances
 * of that value in-place and return the new length.
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array
 * in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what
 * you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int arraySize = nums.length;
        if (arraySize == 0) return 0;
        int counter = 0;
        while (counter < arraySize) {
            if (nums[counter] == val) {
                for (int j = counter; j < arraySize - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                arraySize--;
                counter--;
            }
            counter++;
        }
        return arraySize;
    }
}