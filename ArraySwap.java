import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
//        int[] arr = { 73, 91, 66 ,12,23 , 56};
        Scanner in = new Scanner(System.in) ;
        int[]  arr = new int[5] ;
        for( int i = 0 ; i < arr.length; i++){
            arr[i] = in.nextInt() ;
        }
        System.out.println("before swapped array is :" + Arrays.toString(arr));
        swap(arr , 1 , 4) ;
        System.out.println("swapped array is :" + Arrays.toString(arr));

    }
    static void  swap(int[] arr ,int index1 ,int index2){
        int temp = arr[index1] ;
        arr[index1] =  arr[index2]  ;
        arr[index2]  = temp ;
    }
}
