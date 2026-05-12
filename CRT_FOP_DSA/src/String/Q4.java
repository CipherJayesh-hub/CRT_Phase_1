package String;
/*
toString() is a method in Java that converts an object into a readable string form.
It is automatically called when an object is printed.
 */
class test{
    String name;
    int age;

    test(String n,int a){
        name = n;
        age = a;
    }
    public String toString(){
        return name + "  "+ age;
    }
}
public class Q4 {
    public static void main(String[] args) {
        test t = new test("TestCase",36);
        System.out.println(t);
    }
}
