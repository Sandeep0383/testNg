package oopconceptpart1;

public class FunctionsInJava {
    public static void main(String[]args){

        FunctionsInJava obj = new FunctionsInJava();


        // one object FunctionsInJava will be created
        //obj is reference variable ,referring to this object
        //**** after creating the object ,copy of all the NON STATIC methods will be given to this object
        // if we want to call the non static method of any class,we have to use object reference variable
        // main method is void ---never returns the value

        obj.test();
        int i=obj.pqr();
        System.out.println(i);
        String e=obj.qa() ;
        System.out.println(e);
        int j=obj.division(20,10);
        System.out.println(j);
    }

    //non static methods

    //void---does not return any value
    //return type =void
    public void test(){  //no i/p no o/p
        System.out.println("test method");
    }


    //return type=int
    public int pqr(){ //no i/p some o/p
        System.out.println("pqr method");
        int a=10;
        int b=20;
        int c=a+b;

        return c;
    }

    //return type=string

    public String qa(){ //no i/p some o/p
        System.out.println("qa method");
        String s="string return type ";

        return s;
    }
     // return type=int
    public int division(int x,int y){
        System.out.println("division method");
        int d=x/y;

        return d;


    }


}
