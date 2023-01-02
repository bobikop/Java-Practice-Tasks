package LinkedList;

import java.awt.*;

public class MergeTwoSortedLinkedListsInPlace {

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  public ListNode mergeTwoLists(ListNode curr1, ListNode curr2){

     //create a dummy head node
      ListNode tempHed = new ListNode();
      ListNode prev = tempHed;

      while(curr1 != null && curr2 != null ){
          if(curr1.val <= curr2.val){
              prev.next = curr1;
              curr1 = curr1.next;
          }else{
              prev.next = curr1;
              curr2 = curr2.next;
          }
          prev = prev.next;
      }

      if(curr1 == null) prev.next = curr2;
      else prev.next = curr1;
      return curr1;
  }



}
