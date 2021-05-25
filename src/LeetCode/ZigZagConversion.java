package LeetCode;

import java.util.Arrays;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int len = s.length();
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        for (int i = 0; i < len; i++) {
            int pos = i % (2 * (numRows - 1)); // 2(n-1) = 6
            if (pos < numRows) {
                rows[pos].append(s.charAt(i));
            } else {
                rows[2 * (numRows - 1) - pos].append(s.charAt(i)); // 4 -> 2, 5 -> 1
            }
        }
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            finalString.append(rows[i].toString());
        }
        return finalString.toString();
    }
    public static void main(String[] args) {
        ZigZagConversion z = new ZigZagConversion();
        System.out.println(z.convert("PAYPALISHIRING", 3));
    }
}
