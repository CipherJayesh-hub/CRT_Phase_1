package String;
// methods of String
public class Q1 {
    public static void main(String[] args) {

        String s1 = "Factorization";
        String s2 = "Polymorphism";

        // find length
        System.out.println("length "+s1.length());
        // find character at index
        System.out.println("character at index "+s1.charAt(3));
        // substring find
        System.out.println("substring find "+s1.substring(2,5));
        // upper case and lower case
        System.out.println("upper case "+s1.toUpperCase());
        System.out.println("lower case "+s2.toLowerCase());
        // equals / compare
        System.out.println("compare "+s1.equals(s2));
        // searching
        System.out.println("searching "+s2.contains("o"));
        // index return
        System.out.println("index return "+s2.indexOf("m"));
        // combine
        System.out.println("combine "+s1.concat(s2));
    }
}
