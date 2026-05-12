package Day3_Encapuslation_Abstraction;
// q is static function
class st{
    int a ;
    int b;
    static{
        System.out.println("this is a static method");
    }
    static int add(int a , int b){
        return a + b;
    }

}
public class Q3 {
    public static void main(String[] args) {
//        st s = new st();
//        System.out.println(s.add(5,6));
        int res = st.add(5,9);  // int static method , no need to create a object of a class
        System.out.println(res);
    }
}
