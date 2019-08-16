package oopconceptpart2;

public class ExtendsCar1InheritBMW extends ExtendsCar1Inherit {


    //Method overriding : when  method is present in parent class as well as in child class with same name
    //and same no of arguments is called method overriding

    public void start(){
        System.out.println("BMW start method");
    }

    public void stop(){
        System.out.println("BMW stop method");
    }

    public void safety() {
        System.out.println("BMW safety method");
    }


    public void cooling(){
            System.out.println("auto cooling method");
        }

    public void control(){
        System.out.println("control method");
    }

    }


