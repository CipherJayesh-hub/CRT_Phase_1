package Arrays;
import java.util.Arrays;
class move{
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int j = -1;
        // check first  zero
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        // move non zeros element
        for(int i = j+1;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
public class Q7 {
    public static void main(String[] args) {
        move m = new move();
        int[] z = {1,6,0,4,0,5,0,3};
        m.moveZeroes(z);
        System.out.println(Arrays.toString(z));

    }
}
