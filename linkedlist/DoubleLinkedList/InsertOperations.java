package linkedlist.DoubleLinkedList;

class Node {
    int data;
    Node next;
    Node prev;
    Node(int x) {
        data = x;
        next = prev = null;
    }
}

public class InsertOperations {
    //insert node at begining
    static Node insertAtBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        if(head != null) {
            head.prev = temp;
        }
        return temp;

    }
    //insert the node at end
    static Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if(head == null) return temp;
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;

    }
    //insert the node at specific position
    static Node insertAtPos(Node head, int x,int pos) {
        Node temp = new Node(x);
        if(head == null) return temp;
        if(pos == 1) {
            temp.next = head;
            if(head != null) {
                head.prev = temp;
            }
            return head;
        } else {
            Node curr = head;
            for(int i = 0; i < pos - 2 && curr.next != null; i++) {
                curr = curr.next;
            }
            if(curr == null) return head;
            temp.next = curr.next;
            if(curr.next != null) {
                curr.next.prev = temp;
            }
            curr.next = temp;
            temp.prev = curr;
            return head;
        }
    }
    //print the nodes
    static void printNodes(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data+"<->");
            curr = curr.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Node head = new Node(20);
        Node temp = new Node(25);
        Node temp2 = new Node(30);
        head.next = temp;
        temp.prev = head;
        temp.next = temp2;
        temp2.prev = temp;
        printNodes(head);
        System.out.println("After insertion at begining: ");
        head = insertAtBegin(head, 78);
        printNodes(head);
        System.out.println("After insertion at end: ");
        head = insertAtEnd(head, 42);
        printNodes(head);
        System.out.println("After insertion at specific position: ");
        head = insertAtPos(head, 21, 3);
        printNodes(head);

    }
    
}
