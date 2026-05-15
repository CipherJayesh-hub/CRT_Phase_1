package LinkedList;

class LinkedList{
    Node head ;
    Node tail;
    int val;
    int size = 0;

    // first method  at Tail
    public void adAtTail(int val){
        Node temp = new Node(val);
        if(head==null)  {head=tail=temp;}
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    // method 2
    public void atAtHead(int val){
        Node temp = new Node(val);
        if(head==null)  {head=tail=temp;}
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    // method 3
    void deleteAtTail(){
        Node f = head;
        Node s = head;
        if(f!=null){
            f = f.next.next;
            s = s.next;
        }
        s.next = null;
        tail = s;
        size--;
    }
    // method 4
    void deleteAtHead(){
        if(head == null){
            System.out.println("Empty ll");
            return;
        }
        head = head.next;
    }
    // display list
    void display(){
        Node temp = head ;
        if(head == null) {
            System.out.println("Linked list is null");
        }
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
public class Q1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.adAtTail(5);
        l.adAtTail(10);
        l.adAtTail(15);
        l.display();
        System.out.println();


    }
}
