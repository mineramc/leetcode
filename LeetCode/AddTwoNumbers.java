package LeetCode;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1, l2, false);
    }
    private ListNode helper(ListNode l1, ListNode l2, boolean overflow) {
        int offset = overflow ? 1 : 0;
        int newVal;
        if (l1 == null && l2 == null) {
            if (overflow) {
                return new ListNode(1);
            }
            return null;
        } else if (l1 == null) {
            newVal = l2.val + offset;
            boolean flag = newVal >= 10;
            if (flag) {
                newVal -= 10;
            }
            return new ListNode(newVal, helper(null, l2.next, flag));
        } else if (l2 == null) {
            newVal = l1.val + offset;
            boolean flag = newVal >= 10;
            if (flag) {
                newVal -= 10;
            }
            return new ListNode(newVal, helper(l1.next, null, flag));
        } else {
            newVal = l1.val + l2.val + offset;
            boolean flag = newVal >= 10;
            if (flag) {
                newVal -= 10;
            }
            return new ListNode(newVal, helper(l1.next, l2.next, flag));
        }
    }
    public static void main(String[] args) {

    }
}
