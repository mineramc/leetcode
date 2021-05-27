package LeetCode;

public class MergeTwoSortedLists {
    public static class ListNode {
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

        @Override
        public String toString() {
            if (this.next == null) {
                return Integer.toString(val);
            }
            return Integer.toString(val) + " " + next.toString();
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode pt = root;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pt.next = l1;
                l1 = l1.next;

            } else {
                pt.next = l2;
                l2 = l2.next;
            }
            pt = pt.next;
        }
        if (l1 != null) {
            pt.next = l1;
        } else if (l2 != null) {
            pt.next = l2;
        }
        return root.next;
    }
    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(m.mergeTwoLists(l1, l2));
    }

}
