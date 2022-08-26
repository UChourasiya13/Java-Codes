import java.util.Scanner;

public class ArrayMaxNum {
    public static void main(String[] args) {
        int[] arr = {3 , 2 ,44 ,16 , 99} ;
        maxval(arr);
        System.out.println("Maximum Number within a range is :" + maxrange(arr , 0 , 3) );
    }
//    finding maximum number in an whole array
     static void maxval(int[] arr) {
        int maxnum = arr[0] ;
         for (int i = 0 ; i< arr.length ; i++){
                if(maxnum<arr[i]){
                    maxnum = arr[i] ;
                }
         }
        System.out.println("Maximum number in a Complete array is "+maxnum);
    }


//    finding maximum number within a specific range
    static int maxrange( int[] arr , int start , int end){
            if(arr == null) return -1 ;
            if(start>end) return -1 ;
            int maxval = arr[start] ;
            for( int i = start ; i<=end ; i++){
                if(maxval<arr[i]){
                    maxval = arr[i] ;
                }
            }
            return maxval ;
        }

}
