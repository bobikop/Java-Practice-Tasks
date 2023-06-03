package LinkedList;

import java.awt.*;

public class MergeTwoSortedLinkedListsInPlace {

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }
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

///public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if(l1 == null) return l2;
//        else if(l2 == null) return l1;
//        ListNode dummy = new ListNode(0);
//        ListNode curr = dummy;
//        while(l1 != null && l2!= null){
//            if(l1.val <= l2.val){
//                curr.next = l1;
//                l1 = l1.next;
//            }else {
//                curr.next = l2;
//                l2 = l2.next;
//            }
//            curr = curr.next;
//        }
//        curr.next = l1 == null? l2:l1;
//        return dummy.next;
//    }
