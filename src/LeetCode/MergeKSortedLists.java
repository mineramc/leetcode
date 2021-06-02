package LeetCode;

import static LeetCode.MergeTwoSortedLists.ListNode;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode root = new ListNode();
        ListNode pt = root;
        while (nullNodes(lists) != lists.length) {
            pt.next = new ListNode(minNode(lists));
            pt = pt.next;
        }
        return root.next;
    }
    private int minNode(ListNode[] lists) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < lists.length; i++) {
            ListNode l = lists[i];
            if (l != null && l.val < minValue) {
                minIndex = i;
                minValue = l.val;
            }
        }
        lists[minIndex] = lists[minIndex].next;
        return minValue;
    }
    private int nullNodes(ListNode[] lists) {
        int counter = 0;
        for (ListNode k : lists) {
            if (k == null) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        MergeKSortedLists m = new MergeKSortedLists();
        System.out.println(m.mergeKLists(new ListNode[]{l1, l2, l3}));
    }
}
