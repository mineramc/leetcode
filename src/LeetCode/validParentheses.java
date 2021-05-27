package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class validParentheses {
    public boolean isValid(String s) {
        int paren = 0;
        int curly = 0;
        int square = 0;
        int lastOpening = -1;
        Deque<Integer> lastOne = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    paren += 1;
                    lastOne.addLast(0);
                    break;
                case ')':
                    paren -= 1;
                    if (lastOne.peekLast() == null || lastOne.pollLast() != 0) {
                        return false;
                    }
                    break;
                case '{':
                    curly += 1;
                    lastOne.addLast(1);
                    break;
                case '}':
                    curly -= 1;
                    if (lastOne.peekLast() == null || lastOne.pollLast() != 1) {
                        return false;
                    }
                    break;
                case '[':
                    square += 1;
                    lastOne.addLast(2);
                    break;
                case ']':
                    square -= 1;
                    if (lastOne.peekLast() == null || lastOne.pollLast() != 2) {
                        return false;
                    }
                    break;
                default:
            }
        }
        return paren == 0 && curly == 0 && square == 0;
    }
    public static void main(String[] args) {
        validParentheses v = new validParentheses();
        System.out.println(v.isValid("({})"));
    }
}
