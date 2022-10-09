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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1, temp1 = l2, newHead = null, newTail = null; int carry = 0;
        while(temp != null || temp1 != null){
            int total = 0, num = 0;
            if(temp != null && temp1 != null){
                total = temp.val + temp1.val + carry;
                temp = temp.next;
                temp1 = temp1.next;
            } else if(temp != null){
                total = temp.val + carry;
                temp = temp.next;
            } else{
                total = temp1.val + carry;
                temp1 = temp1.next;
            } num = total%10;
            ListNode newNode = new ListNode(num);
            if(newHead == null){
                newHead = newTail = newNode;
            } else{
                newTail.next = newNode;
                newTail = newNode;
            } carry = total/10;
        } if(carry != 0){
            ListNode newNode = new ListNode(carry);
            newTail.next = newNode;
        } return newHead;
    }
}
