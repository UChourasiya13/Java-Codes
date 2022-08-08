public class Typecasting {
    public static void main(String[] args) {
/*Converting one primitive datatype into another is known as type casting (type conversion) in Java
You can cast the primitive datatypes in two ways namely, Widening and, Narrowing. */

//Widening − Converting a lower datatype to a higher datatype is known as widening.
        char c = 'a';
        int ch = c ;
        System.out.println("Value of Char in int is :" + ch);



/*Narrowing − Converting a higher datatype to a lower datatype is known as narrowing. In this case
the casting/conversion is not done automatically, you need to convert explicitly using the cast
operator “( )” explicitly. Therefore, it is known as explicit type casting.*/
        int a = (int)(45.3333) ;
        System.out.println("integer value of a is :" + a);
        int i = 257;
        byte b = (byte)(i) ;
        System.out.println("Byte value of B is :" + b);



    }
}
