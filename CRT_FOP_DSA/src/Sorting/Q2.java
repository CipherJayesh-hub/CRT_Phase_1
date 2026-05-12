package Sorting;
// q is selection sort
public class Q2 {
    public static void main(String[] args) {

         int [] srr = {5,7,2,6,1,2,3};
        for (int i = 0; i < srr.length - 1 ; i++) {
            int minIndex = i;
            for (int j = i+1; j < srr.length; j++) {
               if(srr[j] < srr[minIndex]){
                   minIndex = j;
               }
            }
                int temp = srr[i];
                srr[i] = srr[minIndex];
                srr[minIndex] = temp;
        }
        System.out.println(java.util.Arrays.toString(srr));
//        for (int num : srr){
//            System.out.print(num +" ");
//        }
    }
}
