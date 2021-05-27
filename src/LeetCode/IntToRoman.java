package LeetCode;

public class IntToRoman {
    public String intToRoman(int num) {
        StringBuilder romanInt = new StringBuilder();
        while (num != 0) {
            if (num - 1000 >= 0) {
                num -= 1000;
                romanInt.append('M');
            } else if (num - 900 >= 0) {
                num -= 900;
                romanInt.append("CM");
            } else if (num - 500 >= 0) {
                num -= 500;
                romanInt.append("D");
            } else if (num - 400 >= 0) {
                num -= 400;
                romanInt.append("CD");
            } else if (num - 100 >= 0) {
                num -= 100;
                romanInt.append("C");
            } else if (num - 90 >= 0) {
                num -= 90;
                romanInt.append("XC");
            } else if (num - 50 >= 0) {
                num -= 50;
                romanInt.append("L");
            } else if (num - 40 >= 0) {
                num -= 40;
                romanInt.append("XL");
            } else if (num - 10 >= 0) {
                num -= 10;
                romanInt.append("X");
            } else if (num - 9 >= 0) {
                num -= 9;
                romanInt.append("IX");
            } else if (num - 5 >= 0) {
                num -= 5;
                romanInt.append("V");
            } else if (num - 4 >= 0) {
                num -= 4;
                romanInt.append("IV");
            } else {
                num -= 1;
                romanInt.append("I");
            }
        }
        return romanInt.toString();
    }
    public static void main(String[] args) {
        IntToRoman i = new IntToRoman();
        System.out.println(i.intToRoman(1994));
    }
}
