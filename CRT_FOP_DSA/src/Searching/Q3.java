package Searching;
class sol3{
public int missingNumber(int[] nums) {
    int n = nums.length;
    int expected_num = n * (n + 1) / 2;
    int actual_sum = 0;
    for (int num : nums) {
        actual_sum += num;
    }
    int res = expected_num - actual_sum;
    return res;
}
}
public class Q3 {
    public static void main(String[] args) {
        sol3 s = new sol3();
        int [] ar = {9,6,4,2,3,5,7,0,1};
        int res = s.missingNumber(ar);
        System.out.println(res);
    }
}
