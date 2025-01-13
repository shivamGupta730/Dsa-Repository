package DP;

import java.util.Arrays;

public class minCostClimbingStairs_Leetcode746 {
    public static void main(String[] args) {
        int[]cost={10,15,20};
        int ans=minCostClimbingStairs(cost);
        System.out.println(ans);

    }
    public static int minCost(int[] cost,int idx,int[]dp){
        if(idx==0||idx==1) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        dp[idx]=cost[idx]+Math.min(minCost(cost,idx-1,dp),minCost(cost,idx-2,dp));
        return dp[idx];
    }
    public  static int minCostClimbingStairs(int[] cost) {
        int idx=cost.length;
        int[]dp=new int[idx];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,idx-1,dp),minCost(cost,idx-2,dp));// idx-1=last index
    }
}
