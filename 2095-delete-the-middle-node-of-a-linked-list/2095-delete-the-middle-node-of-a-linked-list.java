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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
    //     int n = 0;
    //     ListNode temp = head;
    //     while(temp != null){
    //         temp = temp.next;
    //         n++;
    //     }
    //     temp = head;
    //     for(int i=1;i<n/2;i++){
    //         temp = temp.next;
    //     }
    //         temp.next = temp.next.next;
    //     return head;

         ListNode slow = head;
         ListNode fast = head.next;
         while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
         }
         slow.next = slow.next.next;
         return head;
    }
}