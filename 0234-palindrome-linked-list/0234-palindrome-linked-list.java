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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middle(head);
        ListNode secH=reverseList(mid);
         ListNode temp=secH;

         while(head!=null && secH!=null){
            if(head.val!=secH.val){
                break;
            }
            head=head.next;
            secH=secH.next;
         }
         reverseList(temp);
         return head==null|| secH==null;
    }

    public ListNode middle(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!= null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;

    }
    public ListNode reverseList(ListNode head) {
        
        ListNode prev= null;
        ListNode pre= head;
        ListNode next = (pre != null) ? pre.next : null;

        while(pre!=null){
            pre.next=prev;
            prev = pre;
            pre = next;
            if(next!= null){
                next=next.next;
            }
        }
        return prev; 
    }
}