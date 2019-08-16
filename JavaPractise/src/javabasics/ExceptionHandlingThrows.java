package javabasics;

public class ExceptionHandlingThrows {

    public static void main(String[]args)  {
        ExceptionHandlingThrows obj=new ExceptionHandlingThrows();
           obj.sum();
        System.out.println("abc");

    }

    public void sum() throws ArithmeticException{

        try{
        div();
        }
        catch (ArithmeticException e) {
        }
        }

    public void div() throws ArithmeticException{
        int i=9/0;//EXCEPTION LINE
    }

}
