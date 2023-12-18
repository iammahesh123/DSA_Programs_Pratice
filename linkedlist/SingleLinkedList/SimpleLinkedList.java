package linkedlist.SingleLinkedList;

import java.util.Scanner;



public class SimpleLinkedList {
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
    }

}
