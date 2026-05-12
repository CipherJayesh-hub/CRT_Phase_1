package Recursion;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print factorial of a number : ");
        int n = sc.nextInt();
        fact(n);
        int result = fact(n);
        System.out.println(result);

    }
    public static int fact(int num){
        if(num==0 || num==1) return 1;
        int ans = num*fact(num-1);
        return  ans;
//        return (n<=1) ? 1: num*fact(num-1);
    }

}
