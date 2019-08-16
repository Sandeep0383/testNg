package javabasics;

public class ArrayConcept {

    public static void main(String[]args){

        //to store similar data types values in a array variable

        //1.integer array
        //lower bound index=0
        // upper bound is n-1(n is size of array)
        //disadvantages of array :-size is fixed --static array--to overcome this we use collections--array list,hashtable--use dynamic array
        //stores only similar data types----to overcome this we use Object array

        int i[] = new int[4];
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;

        System.out.println(i[3]);
        //System.out.println(i[4]);//array index out of bound exception
        System.out.println(i.length);// .length method to print size of array

        //to print all the values in array
        for(int j=0;j<i.length;j++) {
            System.out.println(i[j]);
        }

           //2. double array
         double d[]=new double[4];
         d[0]=10.11;
         d[1]=11.1;

        System.out.println(d[3]);

        String e[]=new String[4];
        e[0]="test";
        e[1]="hello";
        e[2]="world";
        e[3]="london";


        System.out.println(e[3]);

        //object array(Object is a class)
        Object ob[]= new Object[6];
        ob[0]=10;
        ob[1]="test";
        ob[2]=25;
        ob[3]=02/03/1983;
        ob[4]="m";
        ob[5]="London";

        System.out.println(ob[1]);



    }
}
