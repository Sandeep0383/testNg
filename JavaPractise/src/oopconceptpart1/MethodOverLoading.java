package oopconceptpart1;

public class MethodOverLoading {

    public static void main(String[]args){

        MethodOverLoading obj = new MethodOverLoading();
        obj.sum();
        obj.sum(10);
        obj.sum(10.11);
        obj.sum(10,2);
        obj.sum('d','c');


    }

    public static void main (int a){

    }
    public static void main (double a){

    }
    //we can overload main method also
    //we can not create a  method inside a method
    //duplicate method..same method name with same no of arguments are not allowed


    //MethodOverLoading:- when method name is same with different arguments or input parameters within the same class


    public void sum(){
        System.out.println("no parametres");
    }

    public void sum(int a){
        System.out.println("one parametre");
        System.out.println(a);
    }

    public void sum(double c){
        System.out.println("one parametre with different data types");
        System.out.println(c);
    }

    public void sum(int a ,int b){
        System.out.println("two parametres");
        System.out.println(a/b);
    }

    public void sum(char a,char b){
        System.out.println("two parametres with different data types");
        System.out.println("a");
    }
}
