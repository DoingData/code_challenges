package ca.jrvs.coding.challenges_qs;

import java.util.Arrays;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 */
public class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            if (Arrays.equals(str1, str2)) {
                return true;
            }
        }

        return false;

    }

}
