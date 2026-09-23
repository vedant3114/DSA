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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1=head;
        ListNode temp2=head;
        int size=get(head);
        for(int i=1;i<k;i++){
            temp1=temp1.next;
        } 
        for(int i=1;i<=size-k;i++){
            temp2=temp2.next;
        }
        int temp=temp1.val;
        temp1.val=temp2.val;
        temp2.val=temp;
        return head;
    }
    public int get(ListNode head){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}