package String;
//
/*
string immutable so we use string builder for append the string

A String in Java is immutable, so concatenation does not change the original string.
Java creates a new String object containing the combined text and returns it.
 */
public class Q2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1.concat(s2));

        StringBuilder sb = new StringBuilder("JECRC");
        sb.append("University");
        System.out.println(sb);
    }
}
