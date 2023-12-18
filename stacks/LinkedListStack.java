package stacks;

class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

class Mystack {
    Node head;
    int size;
    Mystack(int val) {
        head = null;
        size = 0;
    }
    int size() { return size; }
    int peek() {  
        if(head == null)
        return Integer.MAX_VALUE;
        return head.data;
      }
    boolean isEmpty() { 
        return (head == null);
     }
    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
     }
    int pop() {
        if(head == null) 
            return Integer.MAX_VALUE;
        int res = head.data;
        head = head.next;
        size--;
        return res;

    }
}

public class LinkedListStack {
    public static void main(String[] args) {
        Mystack s = new Mystack(25);
        s.push(25);
        s.push(30);
        System.out.println(s.size());
        System.out.println(s.peek());
    }
    
}
