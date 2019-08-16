package javabasics;

public class ExceptionHandling {
    //DIFFERENT TYPES OF EXCEPTION
    //1.NULL POINTER EXCEPTION:-WHEN OBJ IS NOT DECLARED PROPERLY ,OR SOME HOW OBJ REFERENCE GOT NULL
    //2.ARRAY INDEX OUT OF BOUND EXCEPTION
    //3.TIME OUT EXCEPTION
    //4.STRING OUT OF BOUND EXCEPTION
    //5.FILE NOT FOUND EXCEPTION

    //int a=10;
    //static ExceptionHandling obj;


    public static void main(String[]args){
        //UNCAUGHT EXCEPTION
        //int i=9/0;
        //System.out.println(i);

        //CAUGHT EXCEPTION
       // Thread.sleep(2000);/

        //int a=10;

        //ExceptionHandling obj=new ExceptionHandling();
        //obj=null;
        //System.out.println(obj.a);


        //TO HANDLE SUCH KIND OF EXCEPTIONS WE USE EXCEPTION HANDLING
        //WE HAVE 3 TYPES OF EXCEPTION HANDLING

        //1.TRY-CATCH BLOCK

        try {
            int i = 9/0;//THIS WILL THROW AN EXCEPTION
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());

        }

        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");

        }

    }
