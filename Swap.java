import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        //swapping of 2 number without using 3rd variable and also using bitwise operator to swap them
        System.out.println("Enter 2 number for swapping :");
        Scanner in =  new Scanner(System.in) ;
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Before swapping value of Num1 and num2 is :" + num1+"  "+num2 );
        swap(num1 , num2) ;

    }
    static void swap( int x , int y){
        x = x^y ;
        y = x^y ;
        x = x^y ;

        System.out.println("After Swapping value of 2 number is :" + x+"  "+y);;
    }
}
