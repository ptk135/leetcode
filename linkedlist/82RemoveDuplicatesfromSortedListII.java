/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution{
public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = dummy;
    while(cur.next!=null){
        boolean flag = false;
        while(cur.next.next!=null && cur.next.val==cur.next.next.val){
            cur.next.next = cur.next.next.next;
            flag = true;
        }
        if(flag){
            cur.next = cur.next.next;
        }
        else
            cur = cur.next;
    }
    return dummy.next;
}}