package linkedlist.SingleLinkedList;
import java.util.Scanner;

//node creation
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}


public class DeleteOperations {
    //delete node at begining
    static Node deleteAtBegin(Node head) {
        if(head == null) return null;
        else return head.next;

    }
    //delete node at end 
    static Node deleteAtEnd(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
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
    System.out.println("After delete at beginging");
    head = deleteAtBegin(head);
    printNodes(head);
    System.out.println("After delete at end");
    head = deleteAtEnd(head);
    printNodes(head);
}
   

    
}
