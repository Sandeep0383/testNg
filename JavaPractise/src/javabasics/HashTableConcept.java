package javabasics;

import java.util.Hashtable;

public class HashTableConcept {

    public static void main(String[]args){

        Hashtable h = new Hashtable();

        h.put("A","Test");
        h.put("B","Hello");
        h.put("c","World");

        System.out.println(h.size());

        h.put(1,100);
        h.put(2,100);
        h.put(3,"tom");

        System.out.println(h.size());

        System.out.println(h.get(3));

        System.out.println(h.get("A"));

        System.out.println(h.get(2));

        Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
        h1.put(1,12);
        h1.put(2,12);

        System.out.println(h1.get(1));

        Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
        h2.put(1,"HEY");


        System.out.println(h2.get(1));















    }
}
