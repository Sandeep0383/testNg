package oopconceptpart1;

public class ClassObjectExCar {
    //class is a kind of entity where we define properties in form no of methods and variables
    int mod;
    int wheel;

    public static void main(String[] args) {

        //new ClassObjectExCar =obj of ClassObjectExCar class
        //new keyword is used to create the object
        //a,b,c--> obj reference variables

        ClassObjectExCar a = new ClassObjectExCar();
        ClassObjectExCar b = new ClassObjectExCar();
        ClassObjectExCar c = new ClassObjectExCar();

        a.mod=2017;
        a.wheel=4;

        b.mod=2018;
        b.wheel=4;

        c.mod=2019;
        c.wheel=4;

        System.out.println("before assigning the reference");

        System.out.println(a.mod);
        System.out.println(a.wheel);

        System.out.println(b.mod);
        System.out.println(b.wheel);

        System.out.println(c.mod);
        System.out.println(c.wheel);

        System.out.println("after assigning the reference");

        a=b;
        b=c;
        c=a;

        System.out.println(c.mod);
        System.out.println(b.mod);
        c.mod=10;
        System.out.println(a.mod);













    }
}
