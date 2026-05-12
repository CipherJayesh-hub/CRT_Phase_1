package String;
// valid palindrome
class Solution1 {
    public boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length()-1;
    while(i<j){
        if (s.charAt(i)==s.charAt(j)){
            return true;
        }
        return false;
    }
    return false;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Solution1 p = new Solution1();
//        p.isPalindrome("NAMAN");
        System.out.println(p.isPalindrome("JAYESH"));


    }
}
