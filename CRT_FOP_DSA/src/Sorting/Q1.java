package Sorting;
import java.util.Arrays.*;
// 1 sort Bubble Sort  bigger element -> last  store
// check the adjacent of two number
public class Q1 {
    public static void main(String[] args) {

        int [] brr = {8,7,3,6,5,2};


        for (int i = 0; i < brr.length - 1 ; i++) {
            boolean flag = false;
            for (int j = 0; j < brr.length -1 -i; j++) {
                if(brr[j] > brr[j+1]){
                    int temp = brr[j];
                    brr[j] = brr[j+1];
                    brr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
//        for(int num : brr){
//            System.out.print(num + " ");
//        }
        System.out.println(java.util.Arrays.toString(brr));
//        System.out.println(brr);
    }
}
