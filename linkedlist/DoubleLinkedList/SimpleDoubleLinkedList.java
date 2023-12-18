package linkedlist.DoubleLinkedList;

//created the node 
class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;
    DoubleNode(int x) {
        data = x;
        next = prev = null;
    }
}
class SimpleLinkedList {
    public static void main(String args[]) {
    	DoubleNode head = new DoubleNode(23);
    	DoubleNode temp = new DoubleNode(34);
    	DoubleNode temp2 = new DoubleNode(34);
        head.next = temp;
        temp.prev = head;
        temp.next = temp2;
        temp2.prev = temp;
        DoubleNode curr = head;
        while(curr != null) {
            System.out.print(curr.data+" <->");
            curr = curr.next;
        }
    }
}
