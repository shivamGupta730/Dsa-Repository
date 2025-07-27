package RECCURSION;

import java.util.Scanner;

public class fibonacchi {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(print(n));
//    }
//    public static int  print(int n){
//       if(n==0||n==1) return n;
//       return print(n-1)+print(n-2);
//    }
static int fib(int n)
{
    // Base Case
    if (n <= 1)
        return n;

    // Recursive call
    return fib(n - 1) + fib(n - 2);
}

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 10;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {

            System.out.print(fib(i) + " ");
        }
    }
}
