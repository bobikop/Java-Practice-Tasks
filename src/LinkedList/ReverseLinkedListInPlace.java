package LinkedList;

public class ReverseLinkedListInPlace {

    public static void main(String[] args) {

    }


    public class ListNode{

        ListNode prev;
        ListNode current;
        ListNode next;

        int value;
    }


     // solution 1
    public ListNode reverseList(ListNode head) {

        // first create two pointers
        ListNode prev = null;
        ListNode current = head;
        ListNode nextN;


        // while loop to iterate until current = null
        while(current != null){

           nextN = current.next;
           current.next=prev;
           prev= current;
           current=nextN;

        }

        // declare new tail and head

        head = prev;
        return  head;

    }

    // solution 2

    public ListNode reverseList2(ListNode head) {

        ListNode prev = null;

        while(head != null){
            ListNode nextN = head.next;
            head.next = prev;
            prev = head;
            head = nextN;
        }


        return  prev;
    }




}


// Reverse the nodes of singly linked list in one pass and in place (no creation of new list)