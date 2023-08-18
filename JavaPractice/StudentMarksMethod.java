import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentMarksMethod {
/*  Write a program that will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */
public static void main(String[] args) {
    System.out.print("Enter Your Mark out of 100 :");
    Scanner in  = new Scanner(System.in) ;
    int Mark = in.nextInt() ;
     grade(Mark);

}

    static void grade(int mark) {
        if ( mark>=91 && mark <=100)  System.out.print(" Grade is : AA");
        else if ( mark>81 && mark <=90) System.out.print("Grade is : AB");
        else if ( mark>71 && mark <=80) System.out.print("Grade is : BB");
        else if ( mark>61 && mark <=70) System.out.print("Grade is : BC");
        else if ( mark>51 && mark <=60) System.out.print("Grade is : CD");
        else if ( mark>41 && mark <=90) System.out.print("Grade is : DD");
        else System.out.print("Fail");

    }
}
