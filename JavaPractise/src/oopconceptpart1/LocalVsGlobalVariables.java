package oopconceptpart1;

public class LocalVsGlobalVariables {
    //global variables or class variables
    String name="tom";
    int age=25;

    public static void main (String[]args){

        int i=20;
        LocalVsGlobalVariables obj=new LocalVsGlobalVariables();

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(i);
        int one=obj.sum();
        System.out.println(one);


    }
      public int sum(){
        int i=10;
        int j=20;
        int age=25;

        return age;
      }

}
