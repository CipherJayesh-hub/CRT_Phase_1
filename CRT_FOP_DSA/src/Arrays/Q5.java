package Arrays;
// reverse a given array
public class Q5 {
    public static void main(String[] args) {
        int[] rev = {1,2,3,4,5,6};
        for (int i = rev.length-1; i>=0 ; i--) {
            System.out.print(rev[i]+" ");
        }
    }
}
