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
    public ListNode middleNode(ListNode head) {
        int mid=size(head)/2 ;
        if(mid==0){
            return head;
        }
        for(int i=1;i<mid;i++){
            head=head.next;
        }
        return head.next;
    }
    public int size(ListNode head){
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}