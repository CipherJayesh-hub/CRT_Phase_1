package Searching;

// binary search
class sol2{
    int binarySearch(int [] arr, int target){
       int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target ) return mid;
            else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
public class Q2 {
    public static void main(String[] args) {
        sol2 s = new sol2();
        int[] ar = {1,5,9,7,11,14,16};
        int res = s.binarySearch(ar,14);
        System.out.println(res);

    }
}
