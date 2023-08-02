package LinkedList;

public class ReverseList {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode head = null;
        s.ReverseList(head);

    }
}


class Solution {
    public ListNode ReverseList (ListNode head) {
        //auxliliary data structs
        ListNode pre = null;

        //base case
        if (head == null){
            return head;
        }

        //nomal case
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

