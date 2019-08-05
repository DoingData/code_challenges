package ca.jrvs.coding.challenges_qs;

/**
 * Find Minimum and Maximum in an array
 */
public class MinMaxInArray {
    public static String minmax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return String.format("%s %s", max, min);

    }

    public static void main(String[] args) {
        System.out.println(minmax(new int[]{1, 2, 199, 22, 33, 3}));
    }
}


