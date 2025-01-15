package RECCURSION;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("your answer is "+factorial(n));
    }
    public static int factorial(int n){
        if(n<=1)return n;
       return n*factorial(n-1);
    }
}
