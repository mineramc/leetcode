package LeetCode;

import java.util.HashSet;

import java.util.Set;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int maxLength = 0;
        String maxPalindrome = null;
        for (int i = 0; i < s.length(); i++) {
            int right = i;
            int left = i;
            while (true) { // finds odd-length palindromes
                if (left < 0 || right >= s.length() || s.charAt(right) != s.charAt(left)) {
                    break;
                }
                right += 1;
                left -= 1;
            }
            right -= 1;
            left += 1;
            if (right - left + 1 >= maxLength) {
                maxPalindrome = s.substring(left, right + 1);
                maxLength = right - left + 1;
            }
            right = i + 1;
            left = i;
            while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) { // finds even-length palindromes
                right += 1;
                left -= 1;
            }
            right -= 1;
            left += 1;
            if (right - left + 1 >= maxLength) {
                maxPalindrome = s.substring(left, right + 1);
                maxLength = right - left + 1;
            }
        }
        return maxPalindrome;
    }


    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        System.out.println(l.longestPalindrome("cbbd"));
    }
}