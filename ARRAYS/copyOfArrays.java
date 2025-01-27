package ARRAYS;

import java.util.Arrays;

public class copyOfArrays {
    public static void main(String[] args) {
        int[]arr={30,10,40,23,89,34};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
//
//        int[]nums=arr; // shallow copy
//        nums[0]=70;
//        Deep Copy
//        method 1
//        int[] brr= Arrays.copyOf(arr,arr.length);
//        brr[0]=90;
//        for(int ele:brr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        System.out.println(arr[0]);
//        Method 2
        int[]crr=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            crr[i]=arr[i];
        }
    }
}
