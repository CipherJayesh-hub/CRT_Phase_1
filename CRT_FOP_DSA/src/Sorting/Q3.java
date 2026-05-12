package Sorting;
// insertion sort
public class Q3 {
    public static void main(String[] args) {

        int[] irr = {42, 7, 19, 3, 25, 8, 15};
        for (int i = 1; i < irr.length ; i++) {
            int key = irr[i];
            int j = i-1;
            //shift bigger element to right
            while(j>=0&&irr[j]>key){
                irr[j+1] = irr[j];
                j--;
            }

            irr[j+1] = key;
        }
        System.out.println(java.util.Arrays.toString(irr));
    }
}
