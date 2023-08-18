# Java-Codes
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class AppendingArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5} ;
        //printing Elements in original array
        System.out.print("Original Array:");
        for(int i =0 ; i< arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        //appending elements in original array
        int [] ar = new int[arr.length + 1]  ;
        int n = ar.length ;

        for(int i = 0 ; i<n-1 ; i++){
            ar[i] = arr[i] ;
        }
        ar[n-1] = 6;
        System.out.println();
        System.out.print("Appended array :");
        //appended array is ;
        for(int i =0 ; i< ar.length; i++){
            System.out.print(" "+ar[i]);
        }



    }
}
