/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode small = dummy;
        ListNode large = dummy;
        while(large.next!=null){
            if(large.next.val >= x)
                large = large.next;
            else{
                // if(small == large){
                //     large = large.next;
                //     small = small.next;
                // }
                // else{
                    ListNode temp = large.next;
                    large.next = temp.next;
                    temp.next = small.next;
                    small.next = temp;
                    small = small.next;
                // }
            }
        }
        return dummy.next;
    }
}