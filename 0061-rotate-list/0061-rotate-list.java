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
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0|| head==null|| head.next==null){
            return head;
        }
        ListNode last=head;
        int len=1;
        while(last.next!=null){
            last=last.next;
            len++;
        }
        last.next=head;
        k=k%len;
        int skip=len-k;
        ListNode newlast=head;
        for(int i=0;i<skip-1;i++){
            newlast=newlast.next;
        }
        head=newlast.next;
        newlast.next=null;
        return head;
    }
}