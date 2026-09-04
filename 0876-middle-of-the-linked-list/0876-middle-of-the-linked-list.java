/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
          ListNode fast = head;
          ListNode slow = head;
          while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
          }
          return slow;
    //     ListNode temp = head;
    //     int n=0;
    //     while(temp != null){
    //          temp = temp.next;
    //          n++;
    //     }
    //    temp = head;
    //    for(int i=0;i<n/2;i++){
    //     temp = temp.next;
    //    }
    //    return temp ;
    // }
}
}