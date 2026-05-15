package Stack_Queue;
/*
 Array based stack me stack ki capacity fixed hoti hai, yani ek baar jitne size ka stack create kar diya uska size normal implementation
 me change nahi hota. Stack me push aur pop operations sirf TOP pointer ko move karte hain. Jab hum pop operation perform karte hain tab
 element actual memory se delete nahi hota, bas top-- ho jata hai aur stack us element ko access karna band kar deta hai. Woh value array
 me temporarily present reh sakti hai jab tak koi naya element us position ko overwrite na kar de.
 */
public class StackArray {
    int [] arr = new int[100];
//    int [] arr;
    int top;
    int capacity;
    int size ;
     StackArray(){
//         this.capacity = capacity;
        top = -1;
        size = 0;

    }
    void push(int x) {  // to insert element in stack
        if(isFully()) {
            System.out.println("Stack Overflow");
        }else {
            top++;
            size++;
            arr[top] = x;
        }
    }
        void pop(){ // to remove an element from top into stack
            if(isEmpty()) {
                System.out.println("stack Underflow");
            }else {

                top--;
                size--;
            }
        }
//    int pop1() { // to remove an element from top into stack
//        int a = 0;
//        if (isEmpty()) {
//            System.out.println("stack Underflow");
//        } else {
//            a = top;
//            top--;
//            size--;
//        }
//        return a;
//    }
        int peek() { // return the top element of the stack
        if(top>=0){
            return arr[top];
        }
        else{
            System.out.println("Stack is empty ");
            return -1;
        }
    }

    boolean isEmpty(){  // is stack is empty
        return top == -1;
    }
    boolean isFully(){ // stack is full
        return top == 100 - 1;
    }

    public static void main(String[] args) {
        StackArray st = new StackArray();
            st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Top Element " + st.peek());
        System.out.println("Size of Stack "+st.size);
        st.pop();
        System.out.println("Top Element after pop " + st.peek());
        System.out.println("Size of Stack "+st.size);


    }
}
