class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast) {
            if(fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedListCycle llc = new LinkedListCycle();

        ListNode nodeA = new ListNode(3);
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(3);
        ListNode nodeD = new ListNode(-4);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(llc.hasCycle(nodeA));
    }
}
