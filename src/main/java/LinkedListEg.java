class LLNode {
    int data;
    LLNode next;

    LLNode(int data) {
        this.data = data;
        //this.next = next;
    }
}

public class LinkedListEg {
    public static void main(String[] args) {
        LLNode nodeA = new LLNode(4);
        LLNode nodeB = new LLNode(2);
        LLNode nodeC = new LLNode(3);
        LLNode nodeD = new LLNode(10);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(countNodes(nodeA));
    }

    static int countNodes(LLNode head) {
        int count = 1;
        LLNode current = head;
        while(current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }




}
