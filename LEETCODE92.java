class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftPre = dummy;
        ListNode currNode = head;

        // Move leftPre and currNode pointers to the left-1 position
        for (int i = 0; i < left - 1; i++) {
            leftPre = leftPre.next;
            currNode = currNode.next;
        }

        ListNode subListHead = currNode;
        ListNode prev = null;
        ListNode nextNode;

        // Reverse the sublist from left to right
        for (int i = 0; i <= right - left; i++) {
            nextNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
        }

        // Adjust pointers to connect the reversed sublist
        leftPre.next = prev;
        subListHead.next = currNode;

        return dummy.next;
    }
}
