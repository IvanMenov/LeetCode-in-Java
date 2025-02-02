package g0001_0100.s0024_swap_nodes_in_pairs;

import com_github_leetcode.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        int len = getLength(head);
        return reverse(head, len);
    }

    private int getLength(ListNode curr) {
        int cnt = 0;
        while (curr != null) {
            cnt++;
            curr = curr.next;
        }
        return cnt;
    }

    // Recursive function to reverse in groups
    private ListNode reverse(ListNode head, int len) {
        // base case
        if (len < 2) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        for (int i = 0; i < 2; i++) {
            // reverse linked list code
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = reverse(curr, len - 2);
        return prev;
    }
}
