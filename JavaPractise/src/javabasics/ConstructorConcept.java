package javabasics;

public class ConstructorConcept {

    String name;
    int age;

    public  ConstructorConcept(){
        System.out.println("default");
    }

    public  ConstructorConcept(int i){
        System.out.println("the value of i is" +" "+i);
    }

    public ConstructorConcept(String name,int age){
        this.name=name;//this.class variable=local variable
        this.age=age;

        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[]args){

        ConstructorConcept obj=new ConstructorConcept();
        ConstructorConcept obj1=new ConstructorConcept(1);
        ConstructorConcept obj2=new ConstructorConcept("tom",25);

    }


}
