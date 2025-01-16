package RECCURSION;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  base number ");
        int a=sc.nextInt();
        System.out.println("enter the power number");
        int b=sc.nextInt();
        System.out.println(pow(a,b));
    }
    public static int pow(int a,int b){
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
}
