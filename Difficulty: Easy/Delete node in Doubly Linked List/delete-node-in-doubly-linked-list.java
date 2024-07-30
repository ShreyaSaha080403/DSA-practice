//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            Node tail = head;

            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                if (head == null) {
                    head = new Node(temp);
                    tail = head;
                } else {
                    Node newNode = new Node(temp);
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }
            }
            int x = sc.nextInt();

            Solution obj = new Solution();
            Node res = obj.deleteNode(head, x);

            Node.printList(res);
        }
    }
}

// } Driver Code Ends


/*

Definition for doubly Link List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        if(head==null){
            return null;
        }
        if(x==1){
            head = head.next;
            if (head != null) { // Check if the list is not empty after deletion
                head.prev = null;
            }
            return head;
        }
        Node temp = head;
        int index = 1;

        // Traverse to the node to be deleted
        while (index < x && temp != null) {
            temp = temp.next;
            index++;
        }

        // If x is greater than the number of nodes, return the unchanged head
        if (temp == null) {
            return head;
        }

        // Deleting the last node
        if (temp.next == null) {
            temp.prev.next = null;
        } else {
            // Deleting a middle node
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        return head;
    }
}
