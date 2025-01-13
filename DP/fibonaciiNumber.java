package DP;

import java.util.Scanner;

public class fibonaciiNumber {
    static  int[]dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.println("your answer "+ans);
    }
    public static  int fibo(int n){
        if(n<=1) return n;
//         to check the dp array if it contains value
        if(dp[n]!=0)return dp[n];
        int ans=fibo(n-1)+fibo(n-2);
//        add the ans into dp array
        dp[n]=ans;
        return ans ;
    }
    public static int fib(int n) {
       dp=new int[n+1];// index from 0 to n
       return fibo(n);
    }
}
