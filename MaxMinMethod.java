import java.util.Scanner;

public class MaxMinMethod {
//    Define two methods to print the maximum and the minimum number respectively
//    among three numbers entered by the user.
public static void main(String[] args) {
    System.out.print("Enter Three number to find maximum and minimum among them :");
    Scanner in  = new Scanner(System.in) ;
    int Num1 = in.nextInt() ;
    int Num2 = in.nextInt() ;
    int Num3 = in.nextInt() ;

    int result1 = max(Num1 , Num3 , Num2);
    int result2 = min(Num1 , Num3 , Num2);
    System.out.println("Maximum number is " + result1 +" And Minimum number is :"+ result2);
}
static int max( int a , int b , int c) {
    int maxy = a ;
    if ( b>maxy) return b ;
    else if (c>maxy)  return c;
    else return a ;
}
static int min( int a , int b , int c) {
    int mini = a ;
    if ( b<mini) return b ;
    else if (c<mini)  return c;
    else return a ;
    }

}
