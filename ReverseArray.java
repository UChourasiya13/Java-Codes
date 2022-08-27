import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]  arr = { 99 , 88 , 77 , 66 , 55 , 44 , 33 , 22 , 11 } ;
        //Before reversing
        System.out.println(Arrays.toString(arr));
        reverse(arr) ;
        //After reversing
        System.out.println(Arrays.toString(arr));
    }
    static void reverse( int[] arr){
        int start = 0 ;
        int end = arr.length -1 ;
        while(start < end ){
            swap(arr , start , end) ;
            start ++ ;
            end -- ;
        }
    }

    static void swap ( int[] arr , int index1 , int index2){
        int temp = arr[index1] ;
        arr[index1] = arr[index2] ;
        arr[index2] = temp ;
    }
}
