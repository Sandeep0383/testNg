package javabasics;

public class SuperConstructorConcept extends ConstructorConcept  {

    public SuperConstructorConcept(){
        super();
    }

    public SuperConstructorConcept(int i){
        super(i);
    }

    public SuperConstructorConcept(String name,int age){
        super(name,age);
    }

    public static void main(String[]args){

        SuperConstructorConcept obj = new SuperConstructorConcept();
        SuperConstructorConcept obj1 = new SuperConstructorConcept(10);
        SuperConstructorConcept obj2 = new SuperConstructorConcept("tom",25);
    }
}
