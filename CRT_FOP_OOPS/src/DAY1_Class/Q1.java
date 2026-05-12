package DAY1_Class;
// q is demonstrated the member fx. and member of a class
class Student{
    int roll = 101;
    String name = "Jayesh";

    void display(){
        System.out.println("Student Name is: "+ name);
        System.out.println("Student Roll No is: "+ roll);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.display();

    }
}
