package javabasics;

public class ExceptionHandlingThrow {

    public static void main(String[]args){


        System.out.println("abc");
        try {
            throw new Exception("Sandeep Exception");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("pqr");

        String Exec_Flag=" ";

        if(Exec_Flag.equals(" ")){
            try {
                throw new Exception("Exec_Flag is blank Exception");
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("test");

    }
}
