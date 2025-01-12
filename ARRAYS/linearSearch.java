package ARRAYS;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[]arr= new int[n];
        System.out.println("enter the element of the array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int x= sc.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==x) System.out.println("the index is "+i);
        }

    }
}
