package LeetCode;

public class strString {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int startPos = 0;
        int actualStart = -1;
        int needlePos = 0;
        for (int i = 0; i < haystack.length(); ) {
            if (haystack.charAt(i) == needle.charAt(needlePos)) {
                if (needlePos == 0) {
                    startPos = i;
                }
                needlePos++;
                i++;
                if (needlePos >= needle.length()) {
                    actualStart = startPos;
                    break;
                }
            } else {
                i = startPos + 1;
                needlePos = 0;
                startPos = i;
            }
        }
        return actualStart;
    }

    public static void main(String[] args) {
        strString s = new strString();
        System.out.println(s.strStr("mississippi", "issi"));
        System.out.println(s.strStr("hello", "ll"));
        System.out.println(s.strStr("aaaaa", "bba"));
    }
}
