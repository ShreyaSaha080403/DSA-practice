//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Driver_code {
    static Node insert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return head;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = temp;
        }
        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            Node head = null;

            String str[] = read.readLine().trim().split(" ");
            int listSize = str.length;
            for (int i = 0; i < listSize; i++) {
                head = insert(head, Integer.parseInt(str[i]));
            }
            boolean f = new Solution().isPalindrome(head);

            System.out.println(f ? "true" : "false");
        }
    }
}

// } Driver Code Ends


/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        
        Node mid=middle(head);
        Node secH=reverseList(mid);
         Node temp=secH;

         while(head!=null && secH!=null){
            if(head.data!=secH.data){
                break;
            }
            head=head.next;
            secH=secH.next;
         }
         reverseList(temp);
         return head==null|| secH==null;
    }

    public Node middle(Node head){
        Node s=head;
        Node f=head;
        while(f!= null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;

    }
    public Node reverseList(Node head) {
        
        Node prev= null;
        Node pre= head;
        Node next = (pre != null) ? pre.next : null;

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