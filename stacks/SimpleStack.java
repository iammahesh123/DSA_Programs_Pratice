package stacks;


class Mystack {
    int arr[];
    int cap;
    int top;
    Mystack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }
    void push(int x) {
        if(top == cap -1) {
            System.out.println("Stack overflow");
        }
        top++;
        arr[top]  = x;

    }
    int pop() { 
        if(top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }
    int peek() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int x = arr[top];
            return x;
        }

    }
    int size() {
        return top + 1;
    }
    boolean isEmpty() {
        return (top == -1);
    }
}
public class SimpleStack {
    public static void main(String[] args) {
        Mystack s = new Mystack(10);
        s.push(12);
        s.push(35);
        System.out.println(s.pop());
        s.push(38);
        System.out.println(s.peek());
        s.push(28);
        System.out.println(s.size());
        System.out.println(s);
    }

}

