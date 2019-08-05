package ca.jrvs.coding.challenges_qs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PalindromeTest {

    @Test
    public void isValidforTest() {
        Palindrome palindrome = new Palindrome();
        String testStr = "racecar";

        assertEquals(testStr, palindrome.isValidforTest("racecar"));
        assertNotEquals(testStr, palindrome.isValidforTest("raceear"));

    }
}