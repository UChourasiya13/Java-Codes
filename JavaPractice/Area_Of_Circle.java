import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
      // Write a Java program to print the area and perimeter of a circle
        float l , b , area , perimeter;
        // l = length , b = breadth
        System.out.print("Enter Length and Breadth Of a circle :");
        Scanner Sc = new Scanner(System.in);
        l = Sc.nextFloat() ;
        b = Sc.nextFloat() ;
        area = l * b ;
        perimeter = 2*(l+b) ;
        System.out.println("area of circle is :" + area);
        System.out.println("Perimeter of circle is :" + perimeter);
    }
}
