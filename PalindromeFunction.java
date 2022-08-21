import java.util.Scanner;

public class PalindromeFunction {
    //Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String[] args) {
        System.out.print("Enter number to check it is palindrome or not :");
        Scanner in = new Scanner(System.in) ;
        int n = in.nextInt() ;
        checkpalindrome(n) ;
    }
    static void checkpalindrome(int num) {
         int r, sum = 0, temp;
       //It is the number variable to be checked for palindrome
        temp=num;
        while (num > 0) {
            r = num % 10;  //getting remainder
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum)
            System.out.println(temp + " is a Palindrome number ");
          else
          System.out.println(temp + " is not a Palindrome");
    }
}

