/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy;
        ListNode end = start;
        while(start!=null){
            for(int i=0; i<k; i++){
                end = end.next;
                if(end == null)
                    return dummy.next;
            }
            ListNode last = start.next;
            for(int i=0; i<k-1; i++){
                ListNode temp = start.next;
                start.next = start.next.next;
                temp.next = end.next;
                end.next = temp;
            }
            start = last;
            end = start;
        }
        return dummy.next;
    }
}