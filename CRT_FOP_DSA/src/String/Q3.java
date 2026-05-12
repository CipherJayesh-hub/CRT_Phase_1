package String;
// swap the string using temporary
public class Q3 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        String temp = a;
        a = b;
        b = temp;

        System.out.println(a + "   "+ b);
    }
}
