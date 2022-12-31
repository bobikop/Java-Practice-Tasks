package LinkedList;

import java.util.HashSet;

public class FindCycle {


    public class ListNode{

        int value;
        ListNode next;

    }


    public boolean hasCycle(ListNode head){

        HashSet<ListNode> visited = new HashSet<>();

        ListNode current  = head;

        while(current != null){
            if(visited. contains(current)) return true; // check if current is already visited and if yes return true
            visited.add(current); // if current is not visited before add it to the hasSet
            current = current.next; // continue operation for next node
        }
        return false;
    }

}


/*
    Given head, the head of a linked list, determine if the linked list has a cycle in it.

        There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

        Return true if there is a cycle in the linked list. Otherwise, return false.

*/
