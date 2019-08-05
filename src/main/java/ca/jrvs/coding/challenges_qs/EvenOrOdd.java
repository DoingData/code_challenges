package ca.jrvs.coding.challenges_qs;

/**
 * Check if a number is even or odd
 */
public class EvenOrOdd {
    public String mod(int num) {
        if (num % 2 == 0) return "even";
        return "odd";
    }

    public String bit(int num) {
        if ((num & 1) == 0) return "even";
        return "odd";
    }
}