// basic code
package sorting;

public class isArraySorted {
    public static void main(String[] args) {
        int[]arr={1,4,7,8,10,12};
        boolean flag=true;
        for(int i=0;i< arr.length;i++){
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]<arr[j]){
                    continue;
                }
                else {
                   flag=false;
                    break;
                }

            }
        }
        if(flag) System.out.println("array is sorted");
        else System.out.println("array is not sorted");
    }
}
