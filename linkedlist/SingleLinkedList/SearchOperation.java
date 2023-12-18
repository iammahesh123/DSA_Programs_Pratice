package linkedlist.SingleLinkedList;

import java.util.Scanner;

//node creation

public class SearchOperation {
    //iterative search
    static int searchElement(Node head, int x) {
        int pos = 1;
        if(head == null) return -1;
        if(head.data == x) {
            return 1;
        } else {
            Node curr = head;
            while(curr != null) {
                if(curr.data == x) return pos;
                else {
                    pos++;
                    curr = curr.next;
                }
            }
        }
        return -1;
    } 
    //recursive search
    static int recursiveSearch(Node head, int x) {
        if(head == null) return -1;
        if(head.data == x) return 1;
        else {
            int res = recursiveSearch(head.next, x);
            if(res == -1) return -1;
            else return (res + 1);
        }
    }
    //print the nodes
    static void printNodes(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.println();
    }
    //driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Node head = new Node(10);
        Node temp = new Node(20);
        Node temp2 = new Node(43);
        Node temp3 = new Node(67);
        head.next = temp;
        temp.next = temp2;
        temp2.next = temp3;
        printNodes(head);
        System.out.println("enter the element to search: ");
        int val = sc.nextInt();
        int res = searchElement(head,val);
        if(res > 0) 
        System.out.println("element found at position: "+res);
        else
        System.out.println("Element is not found");
        // check recursive search operation
        int res2 = recursiveSearch(head, val);
        if(res2 > 0) 
        System.out.println("element found at position: "+res);
        else
        System.out.println("Element is not found");
    }

}