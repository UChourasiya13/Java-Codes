import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Select operation to be performed :");
        Scanner in = new Scanner(System.in) ;
        while( true) {
            char op = in.next().trim().charAt(0) ;
           if ( op== '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
               System.out.print("Enter 2 number  :");
               float num1 = in.nextFloat();
               float num2 = in.nextFloat();
               if(op=='+'){
                   System.out.println("Sum of 2 number is :" + (num1+num2));
               }
               if(op=='-'){
                   System.out.println("Sum of 2 number is :" + (num1-num2));
               }
               if(op=='*'){
                   System.out.println("Sum of 2 number is :" + (num1*num2));
               }
               if(op=='/'){
                   System.out.println("Sum of 2 number is :" + (num1/num2));
               }
               if(op=='%'){
                   System.out.println("Sum of 2 number is :" + (num1%num2));
               }
           }
           else if (op =='x' || op=='X') {
               break;
           }
           else System.out.println("Invalid operation");

        }
    }
}
