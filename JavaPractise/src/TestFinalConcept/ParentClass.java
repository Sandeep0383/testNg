package TestFinalConcept;

//FINAL KEYWORD IS USED TO DEFINE CONSTANT VALUES ,THE VALUES WE CAN NOT CHANGE
// THAT MEANS I CAN NOT CHANGE THE VALUE OF FINAL VARIABLE
//TO PREVENT METHOD OVERRIDING
//TO PREVENT INHERITANCE

public class ParentClass {

    public static void main(String[]args) {
        final int i = 10;
    }

    public void start(){  //public final void -----give error in the child class
        System.out.println("parent--class method");

    }
}
