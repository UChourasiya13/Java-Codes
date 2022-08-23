import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.* ;
public class ArrayBasic {
    public static void main(String[] args) {
        Scanner in  = new Scanner (System.in) ;
        int[] arr = new int[5] ;
        System.out.println("Enter number in array ");
        for( int i = 0 ; i < arr.length ; i ++){
            arr[i] =  in.nextInt() ;
        }
        System.out.println(Arrays.toString(arr));
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i] + " ");
        }

    }
}
