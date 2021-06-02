package LeetCode;
import static LeetCode.MergeTwoSortedLists.ListNode;

public class removeNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = new ListNode(0, head);
        ListNode pointer = head;
        ListNode offset = head;
        if (head.next == null) {
            return null;
        }
        for (int i = 0; i < n + 1; i++) {
            offset = offset.next;
        }
        while (offset != null) {
            pointer = pointer.next;
            offset = offset.next;
        }
        pointer.next = pointer.next.next;
        return head.next;
    }
    public static void main(String[] args) {
        removeNthNode r = new removeNthNode();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode l2 = new ListNode(1, new ListNode(2));
        System.out.println(r.removeNthFromEnd(l1, 3));
    }
}
