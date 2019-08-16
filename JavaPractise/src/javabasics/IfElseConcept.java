package javabasics;

public class IfElseConcept {
    public static void main(String[]args){

        //comparison operators < > <= >= ==

        int a=100;
        int b=200;

        if(a>b) {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }

        int c=40;
        int d=40;
        if(c==d){
            System.out.println("c and d are equal");
        }
        else{
            System.out.println("c and d are not equal");
        }
        //write a logic to find out the highest number

        int a1=20;
        int b1=10;
        int c1=50;

        if (a1>b1 & a1>c1) {
            System.out.println("a1 is the greatest");
        }
        else if (b1>c1) {
            System.out.println("b1 is the greatest");
        }
        else {
            System.out.println("c1 is  the greatest");
        }

    }
}
