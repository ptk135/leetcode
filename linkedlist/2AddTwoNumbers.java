/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int up = 0;
        ListNode current = new ListNode(0);
        ListNode head = current;
        while(l1!=null || l2!=null || up ==1){
            if(l1==null){
                ListNode zero = new ListNode(0);
                l1 = zero;
            }
            if(l2==null){
                ListNode zero = new ListNode(0);
                l2 = zero;
            }
            ListNode temp = new ListNode((l1.val+l2.val+up)%10);
            current.next = temp;
            current =current.next;
            up = (l1.val+l2.val+up)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        return head.next;
    }
}