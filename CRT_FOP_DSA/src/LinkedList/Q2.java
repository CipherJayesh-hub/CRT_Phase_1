package LinkedList;
class revList{
    Node head ;
    Node tail;
    int val;

//    public int rev(Node head) {
//        Node curr = head;
//        Node temp = null;
//    }

    public void adAtTail(int val){
        Node temp = new Node(val);
        if(head==null)  {head=tail=temp;}
        else{
            tail.next = temp;
            tail = temp;
        }
    }
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
public class Q2 {
    public static void main(String[] args) {
        revList r = new revList();
        r.adAtTail(10);
        r.adAtTail(20);
        r.adAtTail(30);
        r.adAtTail(40);
        r.adAtTail(50);
        r.adAtTail(60);


    }
}
