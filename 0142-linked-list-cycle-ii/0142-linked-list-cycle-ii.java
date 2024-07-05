/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        int length =0;
    
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                length=lengthcalc(s);
                break;
            }
        }
        if (length==0){
            return null;
        }

        ListNode p1=head;
        ListNode p2=head;
        while(length>0){
            p2=p2.next;
            length--;
        }
        while(p1!=p2){
            p2=p2.next;
            p1=p1.next;
        }
        return p1;
    }

    public int lengthcalc(ListNode head){
       
        ListNode f=head;
        ListNode s=head;
        
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                 ListNode temp=s;
                 int l=0;
                do{
                    temp=temp.next;
                    l++;
                }while(temp!=s);
                return l;
            }
        }
        return 0;
    }
}