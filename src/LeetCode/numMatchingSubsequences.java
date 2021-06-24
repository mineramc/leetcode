package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class numMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        boolean[] finished = new boolean[words.length];
        int[] position = new int[words.length];
        char lastChar = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == lastChar) {
                continue;
            }
            for (int j = 0; j < words.length; j++) {
                if (finished[j]) {
                    continue;
                }
                int pos = position[j];
                if (words[j].charAt(pos) == c) {
                    position[j]++;
                    if (position[j] == words[j].length()) {
                        finished[j] = true;
                    }
                }
            }
        }
        int answer = 0;
        for (boolean b : finished) {
            if (b) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        numMatchingSubsequences n = new numMatchingSubsequences();
        System.out.println(n.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
    }
}

