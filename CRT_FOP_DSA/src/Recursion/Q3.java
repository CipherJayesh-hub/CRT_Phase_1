package Recursion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fibbo(n);
        System.out.println(res);

        sc.close();
    }

    public static int fibbo(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        return fibbo(n-1) + fibbo(n-2);
    }
}
