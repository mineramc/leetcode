package LeetCode;

import java.lang.Math;
import java.util.HashMap;

public class longestSubString {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        HashMap<Character, Integer> visited = new HashMap<>();
        visited.put(s.charAt(0), 0);
        int startIndex = 0;
        int maxLength = 1;
        for (int i = 1; i < s.length(); i++) {
            if (visited.containsKey(s.charAt(i))) {
                if (visited.get(s.charAt(i)) >= startIndex) {
                    maxLength = Math.max(i - startIndex, maxLength);
                    startIndex = visited.get(s.charAt(i)) + 1;
                }
            }
            visited.put(s.charAt(i), i);
        }
        maxLength = Math.max(s.length() - startIndex, maxLength);
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring("pwikew"));
    }
}
