package ARRAYS;

public class MaxSumSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {6,3,1,-1,6,2,3,2};
        int k = 3;
        int sum = 0, max = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum > max) max = sum;
        }

        System.out.println(max);
    }
}
