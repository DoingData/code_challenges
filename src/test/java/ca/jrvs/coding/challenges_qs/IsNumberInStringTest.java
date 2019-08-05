package ca.jrvs.coding.challenges_qs;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsNumberInStringTest {

    @Test
    public void isDigits() {
        IsNumberInString isNumberInString = new IsNumberInString();
        assertTrue(isNumberInString.isDigits("12345"));
        assertFalse(isNumberInString.isDigits("1234a5"));
        assertTrue(isNumberInString.isDigits(""));

    }
}