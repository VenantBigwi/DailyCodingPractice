/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slow = headA;
        ListNode fast = headB;
        
        while(fast != slow){
            if(slow == null){
                slow = headB;
            }else{
                slow = slow.next;
            }
            if(fast == null){
                fast = headA;
            }else
            fast = fast.next;
        }
 
        if(fast == slow){
            return slow;
        }
        return null;
    }
}