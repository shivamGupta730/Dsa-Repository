package ARRAYS;

public class prefix_sum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int[]pre=new int[arr.length];
//        for (int i=0;i< arr.length;i++){
//            int sum=0;
//            for (int j = 0; j <=i ; j++) {
//                sum=sum+arr[j];
//            }
//            pre[i]=sum;
//        }
//        for (int i = 0; i < pre.length ; i++) {
//            System.out.print(pre[i]+" ");
//        }
        pre[0]=arr[0];
        for (int i = 1; i < pre.length ; i++) {
            pre[i]=pre[i-1]+arr[i];
        }
        for (int i = 0; i < pre.length ; i++) {
            System.out.print(pre[i]+" ");
        }
    }
}
