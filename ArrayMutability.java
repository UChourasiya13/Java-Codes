import java.util.Arrays;

public class ArrayMutability {
    public static void main(String[] args) {
        int[] arr = {333 , 12 , 45 ,312 ,55};
        System.out.println(Arrays.toString(arr));
        change(arr) ;
        System.out.println(Arrays.toString(arr));//Array get mutalble
    }

    static void change(int[] ar) {
        ar[4] = 100 ; // at 4th index of an array we change its value and assign it with 100
    }
}
