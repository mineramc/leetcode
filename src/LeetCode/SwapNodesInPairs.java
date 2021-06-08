package LeetCode;

import static LeetCode.MergeTwoSortedLists.ListNode;
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode swap2 = head.next;
        if (swap2 == null) {
            return head;
        }
        head.next = swapPairs(swap2.next);
        swap2.next = head;
        return swap2;
    }
    public static void main(String[] args) {
        SwapNodesInPairs s = new SwapNodesInPairs();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode l2 = new ListNode(1);
        System.out.println(s.swapPairs(l1));
        System.out.println(s.swapPairs(l2));
    }
}
