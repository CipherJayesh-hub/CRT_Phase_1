package Recursion;
// q is sum of n number
import java.util.Scanner;

import static Recursion.Q1.sum;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = sc.nextInt();
        long res = sum(num);
        System.out.println(s);

    }
static long s= 0;
    public static int sum(long n){
        if(n==0) return 0;
        s = sum += n%10;
        return sum(n/10);
    }
}
