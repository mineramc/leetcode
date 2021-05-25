package LeetCode;

public class ReverseInteger {
    public int reverse(int x) {
        long reversedNumber = 0;
        boolean negFlag = false;
        if (x < 0) {
            negFlag = true;
            x *= -1;
        }
        while (x > 0) {
            int digit = x % 10;
            int length = (int) Math.floor(Math.log10(x));
            reversedNumber += digit * Math.pow(10, length);
            x -= digit;
            x /= 10;
        }
        if (reversedNumber > Integer.MAX_VALUE) {
            return 0;
        }
        return negFlag ? (int) reversedNumber * -1 : (int) reversedNumber;
    }
    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(-123));
    }
}
