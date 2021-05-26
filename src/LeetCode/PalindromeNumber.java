package LeetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        } else {
            int newNum = 0;
            while (x > newNum){
                int digit = x % 10;
                newNum = newNum * 10 + digit;
                x /= 10;
            }
            return newNum == x || newNum / 10 == x;
        }
    }
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome(121));
    }
}
