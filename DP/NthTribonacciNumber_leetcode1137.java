package DP;

public class NthTribonacciNumber_leetcode1137 {
    public static void main(String[] args) {
        int n=25;
        int sol=tribonacci(n);
        System.out.println(sol);
    }
    public static int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        return fibo(n, dp);
    }

    public  static int fibo(int n, int[] dp) {
        if (dp[n] != 0 || n == 0) return dp[n];
        int ans = fibo(n - 1, dp) + fibo(n - 2, dp) + fibo(n - 3, dp);
        dp[n] = ans;
        return ans;
    }
}
