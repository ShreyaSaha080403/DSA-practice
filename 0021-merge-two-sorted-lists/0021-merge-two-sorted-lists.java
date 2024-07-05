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
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        
        ListNode ans = new ListNode(); 
        ListNode current = ans;
        
   
        while(node1!=null && node2!=null){
            if(node1.val<node2.val){
                current.next=node1;
                node1 = node1.next;    
            }
            else{
                current.next= node2;
                node2=node2.next;
            }
            
            current=current.next;
        }
        
        if(node1!=null){
            current.next=node1;
        }
        else{
            current.next=node2;
        }
       return ans.next; 
    }
}