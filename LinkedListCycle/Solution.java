public class Solution {
  public boolean hasCycle(ListNode head) {
      if(head==null || head.next==null)return false;
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null){
          if(slow==null)return false;
          slow=slow.next;
          if(fast.next==null)return false;
          fast=fast.next.next;
          if(fast==slow)return true;
      }
      return false;
  }
}

// check if head or head.next== null, return false
// make two ListNode slow=head and Fast=head
// start until fast!=null and increase slow by 1 step and fast by 2 step
// if slow==fast return true
// else return false 