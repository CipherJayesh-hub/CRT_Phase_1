package Stack_Queue;
class Queue {
    int [] arr = new int[100];
    int front;
    int rear;
    int size;
    int capacity;

    Queue(){
        front = 0;
        rear = -1;
        size = 0;
    }
    void enque(int val){
        if(isFull()){
            System.out.println("Queue is Full");
        }else {
            rear++;
            arr[rear] = val;
            size++;
        }
    }
    int deque(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
            int removed = arr[front];
            front++;
            size--;
            return removed;

    }
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty(){
        return size == 0;
    }
    boolean isFull(){
        return size == 100;
    }
    int size(){
        return size;
    }
    void diaplay(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class queueMain {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.diaplay();

    }
}
