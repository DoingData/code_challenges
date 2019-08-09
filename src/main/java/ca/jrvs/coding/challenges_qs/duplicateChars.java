package ca.jrvs.coding.challenges_qs;
/**
 * Return duplicate characters (in an array) from agiven string
 */
import java.util.HashMap;
import java.util.Map;

public class duplicateChars {

    public void findDuplicateChars(String input) {
        char[] chars = input.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else
                map.put(ch, 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }//end findDuplicate method
}