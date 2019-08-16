package oopconceptpart1;

public class StaticAndNonStaticConcept {

         int age=25;
         static String name ="TOM";

    public static void main(String[]args){

        //how to call static methods and var?
        //1.direct calling
        sum();
        //2.calling by class name
        StaticAndNonStaticConcept.sum();

        System.out.println(name);
        System.out.println(StaticAndNonStaticConcept.name);


        //how to call non static methods and variables?
        StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
        obj.test();
        System.out.println(obj.age);

        //can i access static methods by using object reference?yes
        obj.sum();//warning will be given


    }

    public void test(){
        System.out.println("non static");
    }

    public static void sum(){
        System.out.println("static");
    }

}
