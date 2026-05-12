package Arrays;

import java.util.Scanner;
// insertion and retrieve in array
public class Q2 {
    public static void main(String[] args) {
// for inserting
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int num : arr){
            System.out.print(num+" ");
        }



    }
}
