package ca.jrvs.coding.challenges_qs;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 */
public class Palindrome {

    public boolean isValid(String s) {
        String revStr = reverse(s);
        return (s.equalsIgnoreCase(revStr));

    }

    public String isValidforTest(String s) {
        return reverse(s);
    }

    public String reverse(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
