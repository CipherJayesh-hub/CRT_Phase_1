package Arrays;
// types of arr
public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[10];  // Declaration + Allocation
        int[] arr2 = {2,6,4,7,5,9,8,2};  // Declaration + Initialization
        int [] arr3;  //Declaration
        arr3 = new int[10];  // Memory Allocation
        for (int i = 0; i < arr2.length; i++) {   // retrieve the data
            System.out.println(arr2[i]);
        }
        arr[0] = 10;
        System.out.println(arr[0]);
    }
}
