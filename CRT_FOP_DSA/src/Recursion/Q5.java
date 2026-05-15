//package Recursion;
//
//
//import java.util.Scanner;
//
//public class Q5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(pow(num));
//
//    }
//
//    public static boolean pow(int n){
//        if(n==0) return false;
//        if(n==1) return true;
//        return (n%2==0) && pow(n/2);
//    }
//
//    public static boolean pow(int n){
//        if(n==0) return false;
//        if(n==1) return true;
//        return (n%3==0) && pow(n/3);
//    }
//
//    public static boolean pow(int n){
//        if(n==0) return false;
//        if(n==1) return true;
//        return (n%4==0) && pow(n/4);
//    }
//}
