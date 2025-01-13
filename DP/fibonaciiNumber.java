package DP;

import java.util.Scanner;

public class fibonaciiNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.println("your answer "+ans);
    }
    public static int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}
