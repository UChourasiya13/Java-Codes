import java.util.Scanner;

public class CircleCircumference {
/*   Write a program to print the circumference and area of
  a circle of radius entered by user by defining your own method. */
public static void main(String[] args) {
    System.out.print( " Enter Radius of a Circle :");
    Scanner in = new Scanner(System.in) ;
    float rad = in.nextFloat() ;
    float result = cicumference(rad);
    System.out.println("Cicumference of a circle is :"+ result);
}

     static float cicumference(float r) {
        float cir =  (float)(2*3.14*r);
        return cir ;
    }


}
