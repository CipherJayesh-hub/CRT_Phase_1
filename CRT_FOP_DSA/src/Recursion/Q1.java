package Recursion;

public class Q1 {
    public static void main(String[] args) {

        print(5);
        System.out.println(sum);
    }
    static int sum = 0;
    public static void print(int n) {
        if(n==0) return;
        sum = sum +  n;
        print(n-1);
    }
}