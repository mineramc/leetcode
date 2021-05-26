package LeetCode;

public class RomanToInt {
    public int romanToInt(String s) {
        int convertedNum = 0;
        for (int i = 0; i < s.length(); i++) {
            char romanInt = s.charAt(i);
            switch (romanInt) {
                case 'I':
                    if (i < s.length() - 1) {
                        char nextChar = s.charAt(i + 1);
                        if (nextChar == 'V' || nextChar == 'X') {
                            convertedNum -= 1;
                            break;
                        }
                    }
                    convertedNum += 1;
                    break;
                case 'V':
                    convertedNum += 5;
                    break;
                case 'X':
                    if (i < s.length() - 1) {
                        char nextChar = s.charAt(i + 1);
                        if (nextChar == 'L' || nextChar == 'C') {
                            convertedNum -= 10;
                            break;
                        }
                    }
                    convertedNum += 10;
                    break;
                case 'L':
                    convertedNum += 50;
                    break;
                case 'C':
                    if (i < s.length() - 1) {
                        char nextChar = s.charAt(i + 1);
                        if (nextChar == 'D' || nextChar == 'M') {
                            convertedNum -= 100;
                            break;
                        }
                    }
                    convertedNum += 100;
                    break;
                case 'D':
                    convertedNum += 500;
                    break;
                case 'M':
                    convertedNum += 1000;
                    break;
                default:
                    break;
            }
        }
        return convertedNum;
    }
    public static void main(String[] args) {
        RomanToInt r = new RomanToInt();
        System.out.println(r.romanToInt("MCMXCIV"));
    }
}
