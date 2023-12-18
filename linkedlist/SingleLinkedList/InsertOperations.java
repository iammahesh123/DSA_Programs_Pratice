package linkedlist.SingleLinkedList;
import java.util.Scanner;

//node creation

public class InsertOperations {
    static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }
    // insert node at end
    static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        if(head == null) return temp;
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    } 
    //insert node at specific position
    static Node insertAtPos(Node head, int x, int pos) {
        Node temp = new Node(x);
        if(pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i = 0; i < pos-2 && curr != null; i++) {
            curr = curr.next;
        }
        if(curr == null) return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;

    }
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
    head = insertBegin(head,17);
    System.out.println("After node insert at begining: ");
    printNodes(head);
    head = insertEnd(head, 71);
    System.out.println("After node insert at end: ");
    printNodes(head);
    System.out.println("Enter the position to insert: ");
    int pos = sc.nextInt();
    head = insertAtPos(head,29,pos);
    System.out.println("After node insert at specific position: ");
    printNodes(head);
}

    
}
