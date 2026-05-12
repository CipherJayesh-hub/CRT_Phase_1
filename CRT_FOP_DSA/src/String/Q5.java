package String;
// reverse a string

class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        char temp = 0;
        while(start<end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }


    }
}
public class Q5 {
    public static void main(String[] args) {
        Solution c = new Solution();
        char[] s = {'H','E','L','L','O'};
        c.reverseString(s);
        System.out.println(s);


    }
}
