import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int[] arr = new int[5] ;
        int sum = 0 ;
        System.out.println("Enter number in the array ");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt() ;
        }
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i] ;
        }
        System.out.println("sum of numbers in array is :" + sum);
    }
}
