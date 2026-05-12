package DAY1_Class;
class Student2{
    int roll;
    String name;

    Student2(int roll,String n){
        this.roll = roll ;
        name = n;
    }
    void display(){
        System.out.println(roll);
        System.out.println(name);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Student2 s2 = new Student2(565,"Jayesh");
        s2.display();


    }
}
