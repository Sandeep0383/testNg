package javabasics;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[]args){

        ArrayList ar = new ArrayList();

        ar.add(100);//0
        ar.add(200);//1
        ar.add(300);//2

        System.out.println(ar.size());

        ar.add(400);//3
        ar.add(5050);//4

        System.out.println(ar.size());

        ar.add("tom");//5
        ar.add(12.11);//6
        ar.add("hello");//7
        ar.add('m');//8

        System.out.println(ar.size());
        ar.remove(8);
        System.out.println(ar.size());

        System.out.println(ar.get(4));

        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        ArrayList<Integer> ar1=new ArrayList<Integer>();

        ar.add(100);

        ArrayList<String> ar2 = new ArrayList<String>();

        ar.add("tom");




    }
}
