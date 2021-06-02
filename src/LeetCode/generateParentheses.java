package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> stringList = new ArrayList<>();
        generateHelper(n, 0, new StringBuilder(), stringList);
        return stringList;
    }
    public void generateHelper(int n, int ongoing, StringBuilder currentString, List<String> words) {
        if (n <= 0) {
            words.add(currentString.toString());
            return;
        } else {
            if (ongoing < n) { // able to add another (
                generateHelper(n, ongoing + 1, currentString.append("("), words);
                currentString.deleteCharAt(currentString.length() - 1);
            }
            if (ongoing > 0) { // need to close a parentheses
                generateHelper(n - 1, ongoing - 1, currentString.append(")"), words);
                currentString.deleteCharAt(currentString.length() - 1);
            }
        }
    }
    public static void main(String[] args) {
        generateParentheses g = new generateParentheses();
        System.out.println(g.generateParenthesis(3));
    }
}
