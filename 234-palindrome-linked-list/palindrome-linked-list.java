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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode Before = null;
        ListNode currentNode = slow;
        while (currentNode != null) {
            ListNode After = currentNode.next;
            currentNode.next = Before;
            Before = currentNode;
            currentNode = After;
        }
        while(Before != null){
            if(Before.val != head.val){
                return false;
            }
            Before = Before.next;
            head = head.next;
        }
        return true;
        
    }
}