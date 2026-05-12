package Searching;
// searching
class sol{
    int linearSearch(int [] arr,int target){
        for (int i = 0; i < arr.length-1; i++)
            if(arr[i] == target){
                return i;
        }
        return -1;
    }
}

public class Q1 {
    public static void main(String[] args) {
        sol s = new sol();
        int[] ar = {1,8,5,4,7,6,2};
//        s.linearSearch(ar,4);
        System.out.println(s.linearSearch(ar,11));


    }
}
