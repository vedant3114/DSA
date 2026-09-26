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
    public ListNode reverseList(ListNode head) {
        int start=1;
        int end=size(head);
        while(start<end){
            ListNode first=get(start,head);
            ListNode last=get(end,head);
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
            start++;
            end--;
        }
        return head;
    }
    public ListNode get(int index,ListNode head){
        ListNode temp=head;
        if(index>size(head)){
            return head;
        }
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public int size(ListNode head){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}