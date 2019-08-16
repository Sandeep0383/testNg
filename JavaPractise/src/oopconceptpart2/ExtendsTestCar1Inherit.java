package oopconceptpart2;

public class ExtendsTestCar1Inherit {


    public static void main(String[]args){

          //Static polymorphism -- compile time polymorphism
          // polymorphism :- one to many methods(with the same name and same no of arguments we are creating methods in
          //both parent class and child class ,we are achieving method overriding

        ExtendsCar1InheritBMW obj =new ExtendsCar1InheritBMW();

        obj.radio();//parent class method
        obj.stop();// overridden method
        obj.cooling();//child class method
        obj.vehicle();//grandparent class method

        System.out.println("*****************");

        ExtendsCar1Inherit obj1=new ExtendsCar1Inherit();
        obj1.start();
        obj1.stop();
        obj1.vehicle();

        System.out.println("****************");
        ExtendsCarInherit vobj = new ExtendsCarInherit();

        vobj.vehicle();//it can access only  methods present in parent class




        System.out.println("******************");
        //dynamic polymorphism or run time polymorphism :-child class object can be referred by parent class reference variable
        //only overridden methods and parent class methods can be called using dynamic polymorphism

        ExtendsCar1Inherit obj2 = new ExtendsCar1InheritBMW();
        obj2.start();

        System.out.println("********************");

        //down casting:- not allowed....there will be error class cast exception
        ExtendsCar1InheritBMW b1 = (ExtendsCar1InheritBMW)new ExtendsCar1Inherit();



















    }
}
