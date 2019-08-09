package ca.jrvs.coding.challenges_qs;
/**
 * Given a string containing just the characters
 * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null)
            return false;
        else if (s.equals(""))
            return true;
        Stack<Character> stack = new Stack<Character>();
        char[] sChar = s.toCharArray();
        for (char ch : sChar) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                char pop = stack.pop();
                if (ch == ')' && pop != '(')
                    return false;
                else if (ch == '}' && pop != '{')
                    return false;
                else if (ch == ']' && pop != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}