public class ReverseLinkedList {

    public class ListNode2 {
        int val;
        ListNode2 next;

        ListNode2() {
        }

        ListNode2(int val) {
            this.val = val;
        }

        ListNode2(int val, ListNode2 next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev = null;

        while(head != null) {
            ListNode2 tempNode = head.next;
            head.next = prev;
            prev = head;
            head = tempNode;
        }
        return prev;
    }
}
