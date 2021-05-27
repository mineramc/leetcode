package LeetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            if (charEqualsInStrings(strs, i)) {
                prefix.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return prefix.toString();
    }
    public boolean charEqualsInStrings(String[] strs, int index) {
        for (int i = 0; i < strs.length; i++) {
            try {
                if (strs[i].charAt(index) != strs[0].charAt(index)) {
                    return false;
                }
            } catch (IndexOutOfBoundsException e) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        String[] strs2 = {"flower","flow","flight"};
        LongestCommonPrefix l = new LongestCommonPrefix();
        System.out.println(l.longestCommonPrefix(strs2));
    }
}
