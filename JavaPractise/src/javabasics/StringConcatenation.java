package javabasics;

public class StringConcatenation {

    public static void main (String[]args){
        int a =100;
        int b =200;
        int c =300;

        String x="Hello";
        String y="world";

        //+ sign is concatenation operator
        System.out.println(a+b+c);
        System.out.println(x+y);
        System.out.println(a+x+y);
        System.out.println(x+a+b+x+y+c);

        System.out.println("the addition of a and b is:"+(a+b));

        //difference between print and println
        //println: used to print on the console with new line
        //print: used to just print on the console

        System.out.print("hello selenium");
        System.out.println("hello testing");

    }
}
