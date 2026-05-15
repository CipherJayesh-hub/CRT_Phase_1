package Stack_Queue;
class Node{
    int val ;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class Stackll{
    Node top;
    int size = 0;

    void push(int val){
        Node temp = new Node(val);
        temp.next = top;
        top = temp;
        size++;
    }
    int pop(){
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
            int removed = top.val;
            top = top.next;
            size--;

        return removed;
    }
    int  peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.val;
    }

    boolean isEmpty(){
        return top == null;
    }
    int size(){
        return size;
    }
    void display(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
    }

}

public class StackLinkedList {
    public static void main(String[] args) {
        Stackll sl = new Stackll();
        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.push(40);
        sl.push(50);
        System.out.println();
        System.out.println(sl.peek());


    }
}
