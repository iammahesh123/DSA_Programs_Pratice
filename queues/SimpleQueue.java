package queues;

class Queue {
    int cap;
    int size;
    int[] arr;
    Queue(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
    }
    boolean isFull() {
        return (size == cap);
    }
    boolean isEmpty() {
        return (size == 0);
    }
    void enqueue(int x) {
        if(isFull()) return;
        arr[size] = x;
        size++;
    }
    void dequeue() {
        if(isEmpty()) return;
        for(int i = 0; i < size -1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }
    int getFront() {
        if(isEmpty()) return -1;
        else return 0;
    }
    int getRear() {
        if(isEmpty()) return -1;
        else return (size - 1);
    }
}

public class SimpleQueue {
    public static void main(String[] args) {
        Queue q = new Queue(12);
        q.enqueue(16);
        q.enqueue(48);
        q.enqueue(37);
        q.enqueue(48);
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
    }

}
