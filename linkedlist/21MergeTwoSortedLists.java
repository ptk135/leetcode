/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //在l1上merge
        ListNode current1 = new ListNode(0);
        current1.next = l1;
        ListNode start = current1;
        ListNode current2 = new ListNode(0);
        current2.next = l2;
        while(current1.next!=null && current2.next!=null){
            if(current1.next.val > current2.next.val){
                ListNode temp = current2.next.next;
                current2.next.next = current1.next;
                current1.next = current2.next;
                current2.next = temp;
            }
            else{
                current1 = current1.next;
            }
        }
        if(current1.next==null)
            current1.next = current2.next;
        return start.next;
    }
}