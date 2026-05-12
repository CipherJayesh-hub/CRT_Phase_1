package Arrays;
// find the largest number in array
class Solution {
    public int largest(int[] arr) {
        // code here
        int max = -1;
        for(int i = 0;i<arr.length;i++){
            if(max>arr[i]){
                max = max;
            }
            else{
                max = arr[i];
            }
        }
        return max;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] ar = {1,5,8,7,4,6,9};
        s.largest(ar);
        int result = s.largest(ar);
        System.out.println(result);
    }
}
