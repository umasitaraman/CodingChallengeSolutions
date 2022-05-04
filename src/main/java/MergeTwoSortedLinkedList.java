public class MergeTwoSortedLinkedList {



    public class ListNode1 {
        int val;
        ListNode1 next;
        ListNode1() {}
        ListNode1(int val) { this.val = val; }
        ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
    }

    public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {

        ListNode1 tempNode = new ListNode1(0);
        ListNode1 result = tempNode;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                result.next = list1;
                list1 = list1.next;
            } else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }

        if(list1 != null) {
            result.next = list1;
            list1 = list1.next;
        }

        if(list2 != null) {
            result.next = list2;
            list2 = list2.next;
        }

        return tempNode.next;
    }
    public static void main(String[] args) {

        //list1 = [1,2,4], list2 = [1,3,4]

    }
}


