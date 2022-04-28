public class RemoveNthElementFromEndOfLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        First Submission
//        int length = 0;
//        ListNode ptr = head;
//
//        while (ptr != null) {
//            length++;
//            ptr = ptr.next;
//        }
//
//        if (length == 1) {
//            return head;
//        }
//
//        length = (length) - n;
//        ptr = head;
//
//        while(length > 1) {
//            ptr = ptr.next;
//            length--;
//        }
//        ptr.next = ptr.next.next;
//        return head;
        ListNode traversalNode = head;
        int size = 0;

        while(traversalNode != null){
            traversalNode = traversalNode.next;
            size++;
        }

        if(size == 1 ){
            return null;
        }


        if(n == size){
            return head.next;
        }

        traversalNode = head;
        size = size - n;

        while(size > 1)
        {
            traversalNode = traversalNode.next;
            size--;
        }

        traversalNode.next = traversalNode.next.next;
        return head;
    }


    public static void main(String[] args) {
        ListNode nodeA = new ListNode(1);
        //ListNode nodeB = new ListNode(2);
        //ListNode nodeC = new ListNode(3);
        //ListNode nodeD = new ListNode(4);
        //ListNode nodeE = new ListNode(5);

        //nodeA.next = nodeB;
        //nodeB.next = nodeC;
        //nodeC.next = nodeD;
        //nodeD.next = nodeE;

        removeNthFromEnd(nodeA, 1);

    }


}
