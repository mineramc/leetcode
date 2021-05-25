package LeetCode;

public class StringToInteger {
    public int myAtoi(String s) {
        boolean numberStarted = false;
        boolean negFlag = false;
        long finalInt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!numberStarted && !Character.isDigit(s.charAt(i))) {
                switch (s.charAt(i)) {
                    case ' ':
                        break;
                    case '+':
                        numberStarted = true;
                        break;
                    case '-':
                        numberStarted = true;
                        negFlag = true;
                        break;
                    default:
                        return (int) finalInt;
                }
            } else {
                if (Character.isDigit(s.charAt(i))) {
                    numberStarted = true;
                    int digit = Character.getNumericValue(s.charAt(i));
                    finalInt *= 10;
                    finalInt += digit;
                    if (finalInt > Integer.MAX_VALUE && !negFlag) {
                        return Integer.MAX_VALUE;
                    } else if (finalInt * -1 < Integer.MIN_VALUE && negFlag) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    break;
                }
            }
        }
        finalInt *= negFlag ? -1 : 1;
        return (int) finalInt;
    }
    public static void main(String[] args) {
        StringToInteger m = new StringToInteger();
        System.out.println(m.myAtoi("9223372036854775808"));
    }
}
