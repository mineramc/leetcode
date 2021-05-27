package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class letterCombinationsWrapper {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        int firstDigit = Character.getNumericValue(digits.charAt(0));
        if (digits.length() == 1) {
            return digitToString(firstDigit);
        } else {
            List<String> potentialChars = digitToString(firstDigit);
            List<String> permutations = letterCombinations(digits.substring(1));
            List<String> results = new ArrayList<>();
            for (String c : potentialChars) {
                for (String c1 : permutations) {
                    results.add(c + c1);
                }
            }
            return results;
        }
    }
    private List<String> digitToString(int digit) {
        return switch (digit) {
            case 2 -> new ArrayList<>(Arrays.asList("a", "b", "c"));
            case 3 -> new ArrayList<>(Arrays.asList("d", "e", "f"));
            case 4 -> new ArrayList<>(Arrays.asList("g", "h", "i"));
            case 5 -> new ArrayList<>(Arrays.asList("j", "k", "l"));
            case 6 -> new ArrayList<>(Arrays.asList("m", "n", "o"));
            case 7 -> new ArrayList<>(Arrays.asList("p", "q", "r", "s"));
            case 8 -> new ArrayList<>(Arrays.asList("t", "u", "v"));
            case 9 -> new ArrayList<>(Arrays.asList("w", "x", "y", "z"));
            default -> null;
        };
    }
    public static void main(String[] args) {
        letterCombinationsWrapper l = new letterCombinationsWrapper();
        System.out.println(l.letterCombinations("23"));
    }
}
