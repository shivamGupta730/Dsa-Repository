package RECCURSION;

import java.util.Scanner;

public class fibonacchi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(print(n));
    }
    public static int  print(int n){
       if(n==0||n==1) return n;
       return print(n-1)+print(n-2);
    }
}
